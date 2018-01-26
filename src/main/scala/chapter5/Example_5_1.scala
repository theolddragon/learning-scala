package chapter5

/**
  * Created By tigger on 2018-01-17
  */
class Example_5_1 {

  val largeInt = (x: Int, y: Int) => if(x > y) x else y

  def pickOne(intTurple: (Int, Int, Int), selectFunction: (Int, Int) => Int): Int = {
    selectFunction(intTurple._1, selectFunction(intTurple._2, intTurple._3))
  }
}
