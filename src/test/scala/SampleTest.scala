import Kata.rgb
import org.scalatest.*
import flatspec.*

class SampleTest extends AnyFlatSpec {

  val testCases: List[(Int, Int, Int, String)] = List( // (r, g, b, expected)
    (0, 0, 0, "000000"),
    (1, 2, 3, "010203"),
    (255, 255, 255, "FFFFFF"),
    (254, 253, 252, "FEFDFC"),
    (-20, 275, 125, "00FF7D")
  )

  testCases.foreach { case (r, g, b, expected) =>
    s"rgb($r, $g, $b)" should s"return \"$expected\"" in {
      assertResult(expected) { rgb(r, g, b) }
    }
  }
}
