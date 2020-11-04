package spices

class SimpleSpice(){
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {return 5 }
}

class Spice(var name: String, var spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 2
                "spicy" -> 3
                else -> 0
            }
        }
}

fun main() {
    val simpleSpice = SimpleSpice()
    println("${simpleSpice.name} ${simpleSpice.heat}")

    val spices1 = listOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy")
    )

    val spice = Spice("cayenne", spiciness = "spicy")
    val spicelist = spices1.filter {it.heat < 5}
    fun makeSalt() = Spice("Salt")
}