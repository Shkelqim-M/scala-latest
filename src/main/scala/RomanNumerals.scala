class RomanNumerals {
  private val romanNumerals: List[(Int, String)] = List(
    1000 -> "M",
    900  -> "CM",
    500  -> "D",
    400  -> "CD",
    100  -> "C",
    90   -> "XC",
    50   -> "L",
    40   -> "XL",
    10   -> "X",
    9    -> "IX",
    5    -> "V",
    4    -> "IV",
    1    -> "I"
  )

  def fromRoman(roman: String): Int = {
    val romanSigns = romanNumerals.toMap.map { case (k, v) => v -> k }
    roman.foldRight(0) { (currentChar, total) =>
      val currentValue = romanSigns(currentChar.toString)
      if (total >= currentValue * 5) total - currentValue else total + currentValue
    }
  }

  def toRoman(number: Int): String = romanNumerals
    .foldLeft(("", number)) { case ((result, n), (value, symbol)) =>
      val count = n / value
      (result + symbol * count, n % value)
    }
    ._1
}
