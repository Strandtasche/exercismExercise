//object Bearing extends Enumeration {
//  type Bearing = Value
//  val North = Value(0)
//  val East = Value(1)
//  val South = Value(2)
//  val West = Value(3)
//
//}
sealed trait Bearing
object Bearing {
  case object North extends Bearing
  case object East extends Bearing
  case object South extends Bearing
  case object West extends Bearing
}
