import Allergen._

object Allergies {
  def allergicTo(allergen: Allergen, numb: Int ): Boolean = {
    (numb & allergen.id) != 0
  }

  def list(numb: Int): List[Allergen] = {
    for (i <- Allergen.values.toList if ((numb & i.id) != 0)) yield {i}
  }

}

