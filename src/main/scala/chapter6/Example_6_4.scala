package chapter6

/**
  * Created By tigger on 2018-01-31
  */
class Example_6_4 {

  def longest_maxBy(items: List[String]): String = {
    //items.sortBy(_.size).head
    //items.minBy(_.size)

    //items.sortBy(_.size).last
    items.maxBy(_.size)
  }

  def longest_fold(items: List[String]): String = {
    items.fold("")((a, i) => if(a.size < i.size) i else a)
  }

  def longest_reduce(items: List[String]): String = {
    items.reduce((a, i) => if(a.size < i.size) i else a)
  }

  def select_item[A](items: List[A], selector: (A, A) => A): A = {
    items reduce[A] ((a:A, i:A) => selector(a, i))
  }
}
