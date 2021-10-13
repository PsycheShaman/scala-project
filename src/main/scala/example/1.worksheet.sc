sealed trait Shape

case class Rectangle(width: Int, height: Int) extends Shape

case class Circle(radius: Int) extends Shape

val someCircle: Circle = Circle(5)

val someShape: Shape = someCircle

val someRectangle: Rectangle = Rectangle(2, 5)

val someShapeArea =
  someShape match
    case Rectangle(width, height) => width * height
    case Circle(radius)           => radius * radius * 3.14

someShapeArea

someRectangle match
  case rectangle: Rectangle => s"This is a rectangle with area {rectangle.area}"
  case null                 => "This is not a rectangle"

// someCircle.toString()
