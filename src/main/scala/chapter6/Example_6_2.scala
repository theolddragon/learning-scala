package chapter6

/**
  * Created By tigger on 2018-01-31
  */
class Example_6_2 {

  def factors(x: Int) = {
    2 until x filter(x % _ == 0)
  }

  def factorList(list: List[Int]) = {
    list flatMap factors
  }
}
