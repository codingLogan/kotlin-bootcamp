import java.util.*
import bootcamp.*

//fun main() {
//    println("starting program")
//}
//
//val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//
//
//fun isTooHot(temperature: Int) = temperature > 30
//
//fun isDirty(dirty: Int) = dirty > 30
//
//fun isSunday(day: String) = day == "Sunday"
//
//fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
//    return when {
//        isTooHot(temperature) -> true
//        isDirty(dirty) -> true
//        isSunday(day) -> true
//        else  -> false
//    }
//}
//
//fun swim(speed: String = "fast") {
//    println("swimming $speed")
//}
//
//fun fishFood (day : String) : String {
//    return when (day) {
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//}
//
//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//    println ("Today is $day and the fish eat $food")
//    println("Change water: ${shouldChangeWater(day)}")
//}
//
//fun randomDay() : String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//            "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}

//fun main(args: Array<String>) {
//    feedTheFish()
//    swim()   // uses default speed
//    swim("slow")   // positional argument
//    swim(speed="turtle-like")   // named parameter
//}

//fun main() {
//    // eager, creates a new list
//    val eager = decorations.filter { it [0] == 'p' }
//    println("eager: $eager")
//
//    // lazy, will wait until asked to evaluate
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    println("filtered: $filtered")
//
//    // force evaluation of the lazy list
//    val newList = filtered.toList()
//    println("new list: $newList")
//
//    val lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }
//
//    println("lazy: $lazyMap")
//    println("-----")
//    println("first: ${lazyMap.first()}")
//    println("-----")
//    println("all: ${lazyMap.toList()}")
//
//    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
//        println("access: $it")
//        it
//    }
//    println("-----")
//    println("filtered: ${lazyMap2.toList()}")
//}