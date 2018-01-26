package chapter5

import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-25
  */
class Example_5_1_Test extends FunSuite {

  val example_5_1_Test = new Example_5_1

  test("두 개의 정수를 취하여 더 높은 값을 반환하는 함수 리터럴") {
    assert(example_5_1_Test.largeInt(23, 32) == 32)
  }

  test("세 개의 항목을 가진 정수 튜플과 이 함수를 취아혀 튜플 내의 최댓값을 반환하는 고차 함수") {
    assert(example_5_1_Test.pickOne((14, 7, 9), example_5_1_Test.largeInt) == 14)
  }
}
