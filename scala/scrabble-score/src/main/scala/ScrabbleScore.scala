object ScrabbleScore {

  def scoreLetter(ch: Char): Int = {
    ch.toUpper match {
      case x if "AEIOULNRST".contains(x) => 1
      case x if "DG".contains(x) => 2
      case x if "BCMP".contains(x) => 3
      case x if "FHVWY".contains(x) => 4
      case x if "K".contains(x) => 5
      case x if "JX".contains(x) => 8
      case x if "QZ".contains(x) => 10
      case _ => 0
    }
  }

  def score(inp: String): Int = {
    inp.map(scoreLetter(_)).sum
  }
}
