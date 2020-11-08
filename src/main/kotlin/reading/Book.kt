package reading

import java.util.*

const val MAX_BOOKS = 3

class Book (val title: String, val author: String, val year: String, public var pages: Int) {
    companion object Constants {
        const val BASE_URL = "baseurl"
    }

    fun printUrl() {
        println("url is: $BASE_URL/$title.html")
    }

    fun getInfo(): Pair<String, String> {
        return title to author
    }

    fun getTriple(): Triple< String, String, String> {
        return Triple(title, author, year)
    }

    fun canBorrow(userNumber: Int) = userNumber < MAX_BOOKS
}

fun createBookSet(): Set<String> {
    return setOf("Tristram Adventures", "Tristram Adventures 2")
}

fun main() {
    val book = Book("Tristram Adventures",
    "Deckard Cain",
    "1991", 100)

    val (title, author, year) = book.getTriple()

    println("Here is your book $title written by $author in $year")

    // Get a set of books
    val allBooks = createBookSet()
    val library: Map<String, Set<String>> = mutableMapOf("Deckard Cain" to allBooks)
    println(library.any { it.value.contains("Tristram Adventures") })

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling"}
    moreBooks.getOrPut("Hamlet") { "Shakespeare" }
    println(moreBooks)

    book.printUrl()

    println("make a puppy")
    val puppy = Puppy()
    puppy.playWithBook(book)
}

fun Book.getWeight(): Double = pages * 1.5
fun Book.tornPages(tornPages: Int) = if ( pages >= tornPages ) pages -= tornPages else 0

class Puppy {
    fun playWithBook(book: Book) {
        println("book has ${book.pages} pages")
        book.tornPages(Random().nextInt(12))
        println("book now has ${book.pages} pages")
    }
}