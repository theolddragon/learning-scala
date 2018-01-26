package chapter4

/**
  * 연습문제 7번 함수
  * Created By tigger on 2018-01-17
  */
class Example_4_7 {

  /**
    * @param input : 두 개의 구성 요소로 이루어진(2-사이즈) 튜플 취함
    * @tparam A
    * @tparam B
    * @return : 두 요소 중 Int 값을 첫 번째 위치시켜 반환
    *           없으면 그래도 반환
    */
  def intFirst[A, B](input: (A, B)): (Any, Any) = {
    def isInt(check: Any) = check.isInstanceOf[Int]
    (isInt(input._1), isInt(input._2)) match {
      case (false, true) => (input._2, input._1)
      case _ => input
    }
  }
}
