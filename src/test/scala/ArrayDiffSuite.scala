import org.scalatest.funspec.*
import Kata.arrayDiff

class ArrayDiffSuite extends AnyFunSpec {

  val tests = Seq(
    (Seq(1, 2), Seq(1), Seq(2)),
    (Seq(1, 2, 2), Seq(1), Seq(2, 2)),
    (Seq(1, 2, 2), Seq(2), Seq(1)),
    (Seq(1, 2, 2), Seq(), Seq(1, 2, 2)),
    (Seq(), Seq(1, 2), Seq())
  )

  describe("Basic tests:") {
    tests.foreach { case (a, b, expected) =>
      it(s" Difference between $a and $b should be $expected") {
        assert(arrayDiff(a, b) == expected)
      }
    }
  }
}

object Kata {
  def arrayDiff(a: Seq[Int], b: Seq[Int]): Seq[Int] = {
    a.filterNot(b.contains)
  }
}