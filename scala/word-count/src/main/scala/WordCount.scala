class WordCount(inp: String) {
  def countWords: Map[String, Int] = {
    inp.toLowerCase.split("[^\\w']+").groupBy(identity).mapValues(_.length)
//    .filter(x => x.isLetterOrDigit || x.isWhitespace || x == '\'' || x == '.' || x == '.')
  }
}


object WordCount {
  def apply(inp: String): WordCount = new WordCount(inp)
}
