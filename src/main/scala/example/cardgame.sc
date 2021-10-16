case class Card(shape: Shape, number: Int, color: Color, shading: Sahding)

enum Shape:
  case Diamond, Squiggle, Oval

enum Color:
  case Red, Green, Purple

enum Shading:
  case Open, Striped, Solid
