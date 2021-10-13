sealed trait Action

case class Subscribe(channel: Channel) extends Action
case class Unsubscribe(channel: Channel) extends Action
case class PostMessage(channel: Channel, message: String) extends Action

case class Channel(name: String)

val subscribeEffectiveScala =
  Subscribe(Channel("effective-scala"))

subscribeEffectiveScala
