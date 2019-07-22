//import Bearing.North
import Bearing.{East, North, South, West}

case class Robot(bearing: Bearing, coordinates: (Int, Int) = (0,0)) {

  def advance(): Robot = {
    bearing match {
      case North => copy(coordinates = (coordinates._1, coordinates._2 + 1))
      case East => copy(coordinates = (coordinates._1 + 1, coordinates._2))
      case South => copy(coordinates = (coordinates._1, coordinates._2 - 1))
      case West => copy(coordinates =  (coordinates._1 - 1, coordinates._2))
    }
  }

  def turnRight(): Robot = {
    this.bearing match {
      case North => copy(bearing = East)
      case East => copy(bearing = South)
      case South => copy(bearing = West)
      case West => copy(bearing = North)
    }
  }

  def turnLeft() = {
    this.bearing match {
      case North => copy(bearing = West)
      case East => copy(bearing = North)
      case South => copy(bearing = East)
      case West => copy(bearing = South)
    }
  }

  def simulate(inp: String): Robot = {
    var walker: Robot = this
    for (i <- inp){
      i match {
        case 'R' => walker = walker.turnRight()
        case 'L' => walker = walker.turnLeft()
        case 'A' => walker = walker.advance()
      }
    }
    walker
  }
}


