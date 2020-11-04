package bootcamp

fun stringConcat(first: String, last: String): String {
    return "$first Middle $last"
    // Or you can use the long sytax...
    // return first + " " + "Middle" + " " + last
}

fun expressionConcat(firstNum: Int, secondNum: Int): String {
    return "$firstNum + $secondNum = ${firstNum + secondNum} fish"
}