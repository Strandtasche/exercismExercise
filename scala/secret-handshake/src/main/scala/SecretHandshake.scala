object SecretHandshake {
  private val secret: Map[Int, String] = Map(1 -> "wink", 2 -> "double blink", 4 -> "close your eyes", 8 -> "jump")

  def commands(inp:Int): List[String] = {
    val test2 = (for (i <- (0 to 3).toList) yield {(inp & (1 << i))}).filter(_ != 0).map(secret)
    inp & 16 match {
      case 0 => test2
      case _ => test2.reverse
    }
  }

}
