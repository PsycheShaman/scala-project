case class Experience(duration: Int, definition: Double, network: Network)

enum Network:
  case Fixed, Mobile

val lowQuality = 0.3
val highQuality = 0.6
