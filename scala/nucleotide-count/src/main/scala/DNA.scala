class DNA(nucleotides: String) {
  def nucleotideCounts(): Either[String, Map[Char, Int]] = {
    if (nucleotides.filter(!Set('A', 'C', 'G', 'T').contains(_)).isEmpty) {
      val keyValues = "ACGT"
      Right(( nucleotides + keyValues ).toList.groupBy(identity).mapValues(_.length - 1))
    }
    else {
      Left("invalid nucleotides")
    }
  }
}

object DNA {
  def apply(nucleotides: String): DNA = new DNA(nucleotides)
}
