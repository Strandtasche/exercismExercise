object Series {
  def slices(len: Int, slicee: String): List[List[Int]] = {
    val vec = for {i <- 0 to (slicee.length - len)} yield slicee.slice(i, i+len)
    vec.toList.map(_.toList.map(_.asDigit))
  }
}

