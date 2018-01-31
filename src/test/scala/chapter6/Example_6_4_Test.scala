package chapter6

import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-31
  */
class Example_6_4_Test extends FunSuite {

  val example_6_4_Test = new Example_6_4
  val names = List("Harry", "Hermione", "Ron", "Snape")

  test("testLongest_maxBy") {
    assert(example_6_4_Test.longest_maxBy(names) == "Hermione")
  }

  test("testLongest_fold") {
    assert(example_6_4_Test.longest_fold(names) == "Hermione")
  }

  test("testLongest_reduce") {
    assert(example_6_4_Test.longest_reduce(names) == "Hermione")
  }

}
