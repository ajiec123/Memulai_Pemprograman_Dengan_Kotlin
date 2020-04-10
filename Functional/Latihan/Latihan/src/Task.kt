fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println("First letter is $firstChar and $lastChar for second letter")

}

// TODO 1
fun String.getFirstAndLast(): Map<String, Char>{
    return mapOf("first" to this[0], "last" to this[this.length-1])
}