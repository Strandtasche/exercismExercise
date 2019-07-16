import Bearing._


case class Robot(var bearing: Bearing = Bearing.North, var coordinates: (Int, Int) = (0,0)) {

  def advance(): Robot = {
    this.bearing match {
      case North => Robot(this.bearing, (coordinates._1, coordinates._2 + 1))
      case East => Robot(this.bearing, (coordinates._1 + 1, coordinates._2))
      case South => Robot(this.bearing, (coordinates._1, coordinates._2 - 1))
      case West => Robot(this.bearing, (coordinates._1 - 1, coordinates._2))
    }
  }

  def turnRight(): Robot = {
    Robot(Bearing((bearing.id + 1) % 4), this.coordinates)
  }

  def turnLeft() = {
    Robot(Bearing((bearing.id + 3) % 4), this.coordinates)
  }

  def simulate(inp: String): Robot = {
    for (i <- inp){
      i match {
        case 'R' => this.bearing = turnRight().bearing
        case 'L' => this.bearing = turnLeft().bearing
        case 'A' => this.coordinates = advance().coordinates
      }
    }
    this
  }
}

