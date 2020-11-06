package aquarium

class Aquarium (
        var length: Int = 100,
        var width: Int = 20,
        var height: Int = 40
) {
    // PUBLIC by default

    var volume: Int
        get() = width * height * length / 1000
        set(value) {height = (value * 1000) / (width * length)}

    var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

// Note on visibility
// public - by default
// private - only inside this file (no subclasses)
// protected - subclasses included
// internal - visible anywhere in the same module (your program)

// Constructor, you can create secondary constructors and init blocks
// if you provide a getter you must declare it with val not var

// To subclass you must mark a class as open
// override props and functions that are marked as open (they have to be open, just like classes)

// object keyword creates singleton.  Example uses it for interface delegation
fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length}" +
    "Width: ${myAquarium.width}" +
    "Height: ${myAquarium.height}")

    myAquarium.height = 80
    println("Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small volume: ${smallAquarium.volume}")
}