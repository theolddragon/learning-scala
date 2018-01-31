package chapter6

import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-31
  */
class Example_6_2_Test extends FunSuite {

  var example_6_2_Test = new Example_6_2

  test("Chapter 6. 연습문제 2번 테스트") {
    assert(example_6_2_Test.factors(15) == Vector(3, 5))
  }

  test("Chapter 6. 연습문제 2번 리스트 테스트") {
    assert(example_6_2_Test.factorList(List(9, 11, 13, 15)) == List(3, 3, 5))
  }
}
