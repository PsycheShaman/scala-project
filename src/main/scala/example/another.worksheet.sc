import scala.math.pow

def price(Area: Double, paintPrice: Double): String =
  val price = Area * paintPrice
  if price > 100 then "too expensive"
  else "ok"

price(100, 200)

def price_alt(Area: Double, paintPrice: Double): String =
  val price = Area * paintPrice
  if (price > 100) {
    "too expensive"
  } else { "ok" }

price_alt(10, 5)

case class Rect(w: Int, h: Int):
  val area = w * h

val facade = Rect(w = 5, h = 4)

facade.area

case class Square(width: Int):
  val area = pow(width, 2)

val a = Square(width = 10)

a.area

val smallRect = Rect(w = 2, h = 3)

val largeRect = smallRect.copy(w = 7)

largeRect
