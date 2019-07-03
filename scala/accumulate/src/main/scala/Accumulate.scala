import scala.annotation.tailrec

class Accumulate {
  def accumulate[A, B](f: A => B, list : List[A]): List[B] = {
    @tailrec def accRecursionHelper(original: List[A], accumulation: List[B]): List[B] = {
        if (original.isEmpty) {
          accumulation.reverse
        }
        else {
          accRecursionHelper(original.tail,  f(original.head) +: accumulation )
        }
    }


    accRecursionHelper(list, List[B]())
  }
}
