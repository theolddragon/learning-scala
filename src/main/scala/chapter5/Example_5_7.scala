package chapter5

/**
  * Created By tigger on 2018-01-30
  */
class Example_5_7 {

  val example_5_6 = new Example_5_6

  for(i <- 1 to 100) {
    val a1 = example_5_6.conditional[Int](i, _ % 3 == 0, x => {print("type"); 0})
    val a2 = example_5_6.conditional[Int](i, _ % 5 == 0, x => {print("safe"); 0})

    if(a1 > 0 && a2 > 0) print(i)
    print("")
  }
}
