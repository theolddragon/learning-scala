package chapter6

import java.util.Date

import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-31
  */
class Example_6_3_Test extends FunSuite {

  val example_6_3_Test = new Example_6_3

  test("Chapter 6. foldLeft에서 결합 연산자에 따른 연산 속도 측정") {
    val ints = (1 to 1000).toList

    val startDateLeft = new Date
    println(first_foldLeft_LeftOperator(ints, 700))
    val endDateLeft = new Date

    val startDateReverse = new Date
    println(example_6_3_Test.first_foldLeft(ints, 700))
    val endDateReverse = new Date


    println("Left Operator = " + (endDateLeft.getTime - startDateLeft.getTime))
    println("Right And Reverse = " + (endDateReverse.getTime - startDateReverse.getTime))
  }

  def first_foldLeft_LeftOperator[A](items: List[A], count: Int) = {
    items.foldLeft[List[A]](Nil) { (result: List[A], item: A) =>
      if(result.size >= count) result else result :+ item
    }
  }

  def first_foldLeft_RightOperator[A](items: List[A], count: Int) = {
    items.foldLeft[List[A]](Nil) { (result: List[A], item: A) =>
      if(result.size >= count) result else item :: result
    }
  }
}
