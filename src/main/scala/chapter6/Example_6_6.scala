package chapter6

/**
  * Created By tigger on 2018-01-31
  */
class Example_6_6 {

  def partition(items: List[String]): (List[String], List[String]) = {
    items partition ( item => item == item.reverse )
  }

  def partition_select[A](items: List[A], selector: (A) => Boolean): (List[A], List[A]) = {
    items.foldLeft[(List[A], List[A])]((Nil, Nil)) { (a, i) =>
      if(selector(i)) (i :: a._1, a._2 )
      else (a._1, i :: a._2)
    }
  }
}