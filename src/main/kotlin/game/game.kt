package game

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game {
    var path: MutableList<Directions> = mutableListOf(Directions.START)
    val north: () -> Boolean = {path.add(Directions.NORTH)}
    val south: () -> Boolean = {path.add(Directions.SOUTH)}
    val east: () -> Boolean = {path.add(Directions.EAST)}
    val west: () -> Boolean = {path.add(Directions.WEST)}
    val end: () -> Boolean = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(arg: String?) {
        // Test if string is one of the directions
        when(arg) {
            "n" -> move(north)
            "e" -> move(east)
            "s" -> move(south)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main() {
    val game = Game()
    println(game.path)
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()
    println(game.path)

    while(true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }
}