package fortune

fun main() {
    repeat(10) {
        println(getFortuneCookie())
    }
}

fun getFortuneCookie(): String {
    val pokemon = listOf("charmander", "charmeleon", "charizard", "ditto", "mewtwo")
    print("Enter your birthday")
    val birthday = (readLine()?.toIntOrNull() ?: 1) % pokemon.size
    return "Your fortune pokemon is ${pokemon[birthday]}"
}