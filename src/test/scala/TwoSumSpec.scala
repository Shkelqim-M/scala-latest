import Kata.twoSum
import org.scalatest.flatspec.AnyFlatSpec

class TwoSumSpec extends AnyFlatSpec {
  "twoSum" should "pass basic tests" in {
    val testCases = List(
      (List(1, 2, 3), 4),
      (List(1234, 5678, 9012), 14690),
      (List(2, 2, 3), 4)
    )

    testCases.foreach { case (numbers, target) =>
      val (i1, i2) = twoSum(numbers, target)
      val clue =
        s"\nInput\n  numbers = $numbers\n  target = $target\nActual\n  i1 = $i1 => ${numbers(i1)}\n  i2 = $i2 => ${numbers(i2)}"
      assertResult(target, clue)(numbers(i1) + numbers(i2))
      assertResult(2, "\nResult should contain two distinct indices")(Set(i1, i2).size)
    }
  }
}
