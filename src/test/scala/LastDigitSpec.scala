import org.scalatest.flatspec.AnyFlatSpec
import Kata.lastDigit

class LastDigitSpec extends AnyFlatSpec {
  "lastDigit(0, 0)" should "return 1" in {
    assert(lastDigit(0, 0) == 1)
  }
  "lastDigit(4, 1)" should "return 4" in {
    assert(lastDigit(4, 1) == 4)
  }
  "lastDigit(4, 2)" should "return 6" in {
    assert(lastDigit(4, 2) == 6)
  }
  "lastDigit(9, 7)" should "return 9" in {
    assert(lastDigit(9, 7) == 9)
  }
  "lastDigit(10, 10000000000)" should "return 0" in {
    assert(lastDigit(10, 10000000000L) == 0)
  }
  "lastDigit(2 ** 200, 2 ** 300)" should "return 6" in {
    assert(lastDigit(BigInt(2).pow(200), BigInt(2).pow(300)) == 6)
  }
  "lastDigit(3715290469715693021198967285016729344580685479654510946723, 68819615221552997273737174557165657483427362207517952651)" should "return 7" in {
    assert(lastDigit(BigInt("3715290469715693021198967285016729344580685479654510946723"), BigInt("68819615221552997273737174557165657483427362207517952651")) == 7)
  }
}