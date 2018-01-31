package chapter6

import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-31
  */
class Example_6_5_Test extends FunSuite {

  val example_6_5_Test = new Example_6_5
  val names = List("Harry", "Hermione", "Ron", "Snape")

  test("testReverse_answer") {
    println(example_6_5_Test.reverse_answer(names))
  }


}
