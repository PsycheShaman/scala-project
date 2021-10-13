// enum PrimaryColor:
//   case Red, Green, Blue

def colorBlindProblem(color: PrimaryColor): Boolean =
  color match
    case PrimaryColor.Red   => true
    case PrimaryColor.Blue  => false
    case PrimaryColor.Green => false

sealed trait PrimaryColor
object PrimaryColor:
  case object Red extends PrimaryColor
  case object Blue extends PrimaryColor
  case object Green extends PrimaryColor

val green = PrimaryColor.Green

green

colorBlindProblem(color = green)
colorBlindProblem(color = PrimaryColor.Red)

val color: PrimaryColor = PrimaryColor.Blue
