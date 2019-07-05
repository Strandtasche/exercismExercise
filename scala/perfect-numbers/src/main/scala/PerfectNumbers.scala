object NumberType extends Enumeration {
  type NumberType = Value
  val Perfect, Abundant, Deficient = Value
}

import scala.math.sqrt
import scala.math.floor
import NumberType._

object PerfectNumbers {
  def classify(numb: Int): Either[String, NumberType] = {
    if (numb <= 0) {
      Left("Classification is only possible for natural numbers.")
    }
    else {
      if (numb == getDivisorSum(numb)) {
        Right(NumberType.Perfect)
      }
      else if(numb < getDivisorSum(numb)) {
        Right(NumberType.Abundant)
      }
      else {
        Right(NumberType.Deficient)
      }
    }
  }

  def getDivisorSum(numb: Int): Int = {
    (1 to (numb/2).toInt).filter(d => numb % d == 0).sum
  }
}

