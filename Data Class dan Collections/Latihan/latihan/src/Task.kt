fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
            "type" to "Motorcycle",
            "speed" to "230Km/s",
            "tank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle.getValue("type")
    val maxSpeed = vehicle.getValue("speed")
    val maxTank = vehicle.getValue("tank")

    // TODO 3
    println("Vehicle")
    println("""
        |Type: $type
        |Maximal Speed: $maxSpeed
        |Maximal Tank: $maxTank
    """.trimMargin())

}