object Kata {

  def lastDigit(n1: BigInt, n2: BigInt): BigInt =
    if (n2 == 0) 1 else if (n2 % 2 == 0) lastDigit(n1 * n1 % 10, n2 / 2) else n1 * lastDigit(n1 % 10, n2 - 1) % 10

  def tribonacci[T: Numeric](signature: List[T], n: Int): List[T] =
    if (n == 0) List.empty[T]
    else {
      var response = signature.take(n)
      for (i <- 1 to n - signature.length) {
        val temp = response.takeRight(3).sum
        response = response :+ temp
      }
      response
    }

  def rgb(r: Int, g: Int, b: Int): String =
    Seq(r, g, b).map {
      case x if x <= 0   => "00"
      case x if x >= 255 => "FF"
      case x if x >= 16  => x.toHexString.toUpperCase
      case x             => "0" + x.toHexString.toUpperCase
    }.mkString

  def duplicateCount(str: String): Int = str.groupBy(_.toLower).count(_._2.length > 1)

  def arrayDiff(a: Seq[Int], b: Seq[Int]): Seq[Int] = a.filterNot(b.contains)

  def createPhoneNumber(numbers: Seq[Int]): String = {
    val ns = numbers.mkString
    s"(${ns.take(3)}) ${ns.slice(3, 6)}-${ns.takeRight(4)}"
  }

  def likes(names: Array[String]): String =
    names match
      case Array()          => "no one likes this"
      case Array(x)         => s"$x likes this"
      case Array(x, y)      => s"$x and $y like this"
      case Array(x, y, z)   => s"$x, $y and $z like this"
      case Array(x, y, zs*) => s"$x, $y and ${zs.size} others like this"

  def openOrSenior(data: List[(Int, Int)]): List[String] =
    data.map { case (age, handicap) =>
      if (age >= 55 && handicap > 7) "Senior" else "Open"
    }

  def addBinary(a: Int, b: Int): String = (a + b).toBinaryString

  def score(dice: Seq[Int]): Int = {
    val counts = dice.groupBy(identity).view.mapValues(_.size)
    counts.foldLeft(0) { case (totalScore, (num, count)) =>
      num match {
        case 1 =>
          val tripletScore = (count / 3) * 1000
          val singleScore  = (count % 3) * 100
          totalScore + tripletScore + singleScore
        case 5 =>
          val tripletScore = (count / 3) * 500
          val singleScore  = (count % 3) * 50
          totalScore + tripletScore + singleScore
        case _ =>
          val tripletScore = (count / 3) * num * 100
          totalScore + tripletScore
      }
    }
  }

  def twoSum(numbers: List[Int], target: Int): (Int, Int) =
    numbers.zipWithIndex.combinations(2).collectFirst { case Seq((a, i), (b, j)) if a + b == target => (i, j) }.get
  /* { // old letCode implementation
    val withIndex = numbers.zipWithIndex
    val hashMap   = withIndex.toMap
    withIndex.collectFirst {
      case (value, index) if hashMap.get(target - value).exists(_ != index) =>
        (index, hashMap(target - value))
    }.get
  }*/
}
