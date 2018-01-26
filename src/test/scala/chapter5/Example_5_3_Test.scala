package chapter5

import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-25
  */
class Example_5_3_Test extends FunSuite {

  val example_5_3_Test = new Example_5_3

  test("고차함수 테스트") {
    val tripler = example_5_3_Test.multy(3);

    assert(tripler(10) == 30)
  }
}
