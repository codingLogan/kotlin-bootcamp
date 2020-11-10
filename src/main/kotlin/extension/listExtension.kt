package extension

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main() {
    val myList = listOf(1,2,3,4,5,6,7,8,9)
    print(myList.divisibleBy() {it % 3})
}