class Matrix(matrixString: String) {

  val matrix = matrixString.split('\n').map(_.split(' '))
  def row(r: Int)= matrix(r).map(_.toInt)
  def column(c: Int)= matrix.map{_(c)}.map(_.toInt)
}

object Matrix {
  def apply(matrixString: String): Matrix = new Matrix(matrixString)
}
