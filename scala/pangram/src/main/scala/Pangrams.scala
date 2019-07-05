object Pangrams {
  def isPangram(input: String): Boolean = {
    val alphabet = ('a' to 'z').toSet
    val inp = input.map(_.toLower).toSet
    alphabet.forall(inp.contains(_))
  }
}

