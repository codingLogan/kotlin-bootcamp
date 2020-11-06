package spices

class SimpleSpice(){
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {return 5 }
}

//abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
//    abstract fun prepareSpice()
//}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {

    abstract fun prepareSpice()

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

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpice: SpiceColor {
    override val color = "yellow"
}

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpice) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
        println("grind spice")
    }
    override fun prepareSpice() {
        grind()
    }
}

fun main() {
    val curry = Curry("Logan's Curry", "mild")
    print(curry.color)
    print(curry.heat)
    print(curry.name)
}