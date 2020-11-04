package bootcamp

fun testWhen(value: Int): String {
    return when (value) {
        0 -> "zero"
        in 1..10 -> "less than 10"
        else -> "plenty"
    }
}

fun forLoops() {
    for (i in 1..10) {
        print(1)
    }

    for (i in 'x'..'z') {
        print(i)
    }

    for (i in 10 downTo 0) {
        print(i)
    }

    for (i in 0..10 step 2) {
        print(i)
    }

    val swarm = listOf("trout", "salmon")
    for (element in swarm) {
        print(element)
    }

    for ((index, element) in swarm.withIndex() ) {
        println("$index is $element")
    }
}