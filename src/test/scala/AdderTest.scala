import org.scalatest.FunSuite

/**
  * Created By tigger on 2018-01-17
  */
class AdderTest extends FunSuite {

  test("1 더하기 2는 3이 나와야 함.") {
    val myAdder = new Adder
    assert(myAdder.add(1, 2) == 3)
  }
}
