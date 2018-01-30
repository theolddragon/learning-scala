package chapter5

/**
  * Created By tigger on 2018-01-30
  */
class Example_5_6 {

  def conditional[A](x: A, p: A => Boolean, f: A => A): A = {
    if(p(x)) f(x) else x
  }
}
