object Etl {
  def transform(inp: Map[Int, Seq[String]]): Map[String, Int] = {
    for {(score, values) <- inp; letter <- values} yield (letter.toLowerCase -> score)
  }
}
