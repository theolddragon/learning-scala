package chapter4

import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-17
  */
class Example_4_1_Test extends FunSuite {

  test("반지름 8의 원의 면적은 201.06192982974676이다.") {
    val example_4_1_Test = new Example_4_1
    assert(example_4_1_Test.roundArea(8) == 201.06192982974676)
  }
}
