package chapter4

/**
  * 연습문제 8번 함수
  * Created By tigger on 2018-01-17
  */
class Example_4_8 {

  /**
    * @param input : 세 개의 구성 요소를(3-사이즈) 튜플을 취함
    * @tparam A
    * @tparam B
    * @tparam C
    * @return : 6-사이즈 튜플로 반환
    *           원래의 매개변수 다음에 그 매개변수의 String 표기를 추가하여 반환
    */
  def stringfy[A, B, C](input: (A, B, C)): (Any, String, Any, String, Any, String) = {
    (input._1, input._1.toString(), input._2, input._2.toString(), input._3, input._3.toString())
  }
}
