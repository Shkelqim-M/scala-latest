import org.scalatest._
import flatspec._
import matchers.should._
import Kata._

class KataTest extends AnyFlatSpec with Matchers {
  "likes(Array())" should "return \"no one likes this\"" in {
    likes(Array()) shouldBe "no one likes this"
  }
  "likes(Array(\"Peter\"))" should "return \"Peter likes this\"" in {
    likes(Array("Peter")) shouldBe "Peter likes this"
  }
  "likes(Array(\"Jacob\", \"Alex\"))" should "return \"Jacob and Alex like this\"" in {
    likes(Array("Jacob", "Alex")) shouldBe "Jacob and Alex like this"
  }
  "likes(Array(\"Max\", \"John\", \"Mark\"))" should "return \"Max, John and Mark like this\"" in {
    likes(Array("Max", "John", "Mark")) shouldBe "Max, John and Mark like this"
  }
  "likes(Array(\"Alex\", \"Jacob\", \"Mark\", \"Max\"))" should "return \"Alex, Jacob and 2 others like this\"" in {
    likes(Array("Alex", "Jacob", "Mark", "Max")) shouldBe "Alex, Jacob and 2 others like this"
  }

  "addBinary(1, 1)" should "return \"10\"" in {
    addBinary(1, 1) shouldBe "10"
  }
  "addBinary(0, 1)" should "return \"1\"" in {
    addBinary(0, 1) shouldBe "1"
  }
  "addBinary(1, 0)" should "return \"1\"" in {
    addBinary(1, 0) shouldBe "1"
  }
  "addBinary(2, 2)" should "return \"100\"" in {
    addBinary(2, 2) shouldBe "100"
  }
  "addBinary(51, 12)" should "return \"111111\"" in {
    addBinary(51, 12) shouldBe "111111"
  }
}
