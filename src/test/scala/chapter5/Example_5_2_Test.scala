package chapter5

import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-25
  */
class Example_5_2_Test extends FunSuite {

  val example_5_1_Test = new Example_5_1
  val example_5_2_Test = new Example_5_2

  test("가장 작은 숫자 확인 테스트") {
    assert(example_5_1_Test.pickOne((-233084145, 1722379081, 683222211), example_5_2_Test.smallInt) == -233084145)
  }

  test("두 번째 숫자 가져오는 지 확인") {
    assert(example_5_1_Test.pickOne((-233084145, 1722379081, 683222211), example_5_2_Test.secondInt) == 683222211)
  }
}
