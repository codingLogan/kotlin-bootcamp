package bootcamp
import java.util.*

fun doAddition(firstNum: Int, secondNum: Int): Int {
    println("$firstNum + $secondNum")
    return firstNum + secondNum
    // Could also do firstNum.plus(secondNum)

}

fun doSubtraction(firstNum: Int, secondNum: Int): Int {
    println("$firstNum - $secondNum")
    return firstNum - secondNum
    // Could also do firstNum.minus(secondNum)
}

// There are other operators as well, * / %

fun doElvisOperation(value: Int?): String {
    // Notice value ?. below
    // That is null checking, if it is NOT null it will use the next piece
    // If it is NULL, it will use the value after the "elvis operator" ?:
    return value?.toString() ?: "elvis operator"
}