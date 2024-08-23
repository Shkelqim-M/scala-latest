import Kata.duplicateCount
import org.scalatest.*
import org.scalatest.flatspec.*
import org.scalatest.matchers.should.*

class DupsTest extends AnyFlatSpec with Matchers {

  "duplicateCount(\"abcde\")" should "return 0" in {
    duplicateCount("abcde") should be(0)
  }

  "duplicateCount(\"abcdea\")" should "return 1" in {
    duplicateCount("abcdea") should be(1)
  }

  "duplicateCount(\"indivisibility\")" should "return 1" in {
    duplicateCount("indivisibility") should be(1)
  }
}
