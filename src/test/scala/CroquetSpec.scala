import Kata.openOrSenior
import org.scalatest.flatspec.AnyFlatSpec

class CroquetSpec extends AnyFlatSpec {
  "openOrSenior" should "pass basic tests" in {
    val testCases = List( // data, expected
      (List((45, 12), (55, 21), (19, -2), (104, 20)), List("Open", "Senior", "Open", "Senior")),
      (List((3, 12), (55, 1), (91, -2), (54, 23)), List("Open", "Open", "Open", "Open")),
      (List((59, 12), (55, -1), (12, -2), (12, 12)), List("Senior", "Open", "Open", "Open")),
      (List((74, 10), (55, 6), (12, -2), (68, 7)), List("Senior", "Open", "Open", "Open")),
      (List((16, 23), (56, 2), (56, 8), (54, 6)), List("Open", "Open", "Senior", "Open"))
    )

    testCases.foreach { case (data, expected) =>
      assertResult(expected, s"\nInput\n  data = $data")(openOrSenior(data))
    }
  }
}
