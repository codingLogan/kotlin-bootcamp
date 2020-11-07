package reading

class Book (val title: String, val author: String, val year: String) {
    fun getInfo(): Pair<String, String> {
        return title to author
    }

    fun getTriple(): Triple< String, String, String> {
        return Triple(title, author, year)
    }
}

fun main() {
    val book = Book("Tristram Adventures",
    "Deckard Cain",
    "1991")

    val (title, author, year) = book.getTriple()

    println("Here is your book $title written by $author in $year")
}