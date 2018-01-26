package chapter4

import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-17
  */
class Example_4_8_Test extends FunSuite {

  test("연습문제 8번 테스트") {
    val example_4_8_Test = new Example_4_8
    assert(example_4_8_Test.stringfy(true, 22.25, "yes") == (true, "true", 22.25, "22.25", "yes", "yes"))
  }
}
