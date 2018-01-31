package chapter6

/**
  * Created By tigger on 2018-01-31
  */
class Example_6_5 {

  def reverse[A](items: List[A]): List[A] = {
    items.reverse
  }

  def reverse_foldLeft[A](items: List[A]): List[A] = {
    items.foldLeft[List[A]](Nil) { (reverseItems: List[A], item: A) =>
      item :: reverseItems
    }
  }

  def reverse_answer[A](src: List[A], dest: List[A] = Nil): List[A] = {
    if (src == Nil) dest else reverse_answer(src.tail, src.head :: dest)
  }
}
