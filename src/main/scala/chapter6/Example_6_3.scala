package chapter6

/**
  * Created By tigger on 2018-01-31
  */
class Example_6_3 {

  def first[A](items: List[A], count: Int) = {
    items take count
  }

  def first_for[A](items: List[A], count: Int) = {
    val result = for(i <- 1 to count) yield items(i)
    result.toList
  }

  def first_foldLeft[A](items: List[A], count: Int) = {
    items.foldLeft[List[A]](Nil) { (result: List[A], item: A) =>
      if(result.size >= count) result else item :: result
    }.reverse
  }

  def first_recursion[A](items: List[A], count: Int): List[A] = {
    if(count != 0 && items.tail != Nil) items.head :: first_recursion(items.tail, count - 1)
    else Nil
  }
}
