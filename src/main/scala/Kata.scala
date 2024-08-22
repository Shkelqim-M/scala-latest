object Kata {
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
}
