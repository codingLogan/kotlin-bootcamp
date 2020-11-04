package what.todo

fun main() {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temp: Int = 24): String {
    return when {
        (mood === "happy" && weather === "sunny") -> "go for a walk"
        (mood === "happy" && weather === "sunny" && temp > 24) -> "stay inside"
        else -> "go to bed"
    }
}