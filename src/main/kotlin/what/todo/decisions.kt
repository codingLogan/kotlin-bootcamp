package what.todo

fun main() {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temp: Int = 24): String {
    return when {
        shouldGoWalking(mood, weather) -> "go for a walk"
        shouldStayInside(mood, weather, temp) -> "stay inside"
        else -> "go to bed"
    }
}

fun shouldGoWalking(mood: String, weather: String) = (mood === "happy" && weather === "sunny")
fun shouldStayInside(mood: String, weather: String, temp: Int) =(mood === "happy" && weather === "sunny" && temp > 24)