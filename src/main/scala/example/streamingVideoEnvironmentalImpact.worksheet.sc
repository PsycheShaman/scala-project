// QUESTION: what is the influence of streaming video on the environment?

case class Experience(duration: Int, definition: Double, network: Network)

enum Network:
  case Fixed, Mobile

val lowQuality: Double = 0.3 // MB/s
val highQuality: Double = 0.6 // MB/s

val thirtyMinutes: Int = 30 * 60 //seconds

val highQualityAndMobile =
  Experience(
    duration = thirtyMinutes,
    definition = highQuality,
    network = Network.Mobile
  )

val lowQualityAndFixed =
  Experience(
    duration = thirtyMinutes,
    definition = lowQuality,
    network = Network.Fixed
  )

val dataCenterEnergy = 0.000072

def networkEnergy(network: Network): Double = network match
  case Network.Fixed  => 0.00043
  case Network.Mobile => 0.00088
end networkEnergy

val kgCO2PerKWh = 0.5

def footprint(experience: Experience): Double =
  val megaBytes = experience.duration * experience.definition
  val energy = dataCenterEnergy + networkEnergy(network = experience.network)
  energy * megaBytes * kgCO2PerKWh
end footprint

footprint(lowQualityAndFixed)
footprint(highQualityAndMobile)
