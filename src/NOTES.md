# Learning Notes
if statements have ranges
if ( variable in 1..100 )

when is the switch statement
```
when (variable) {
    0 -> ...
    in 2..50 -> ...
    else -> ..
}
```

## Nullabes
Add a question `?` to the type statement

`var marbles: Int? = null`

you can check for null inline, and assign a default if it is null

`var newVar: Int = something?.getNewInt() ?: 0`

## Lists
To create a list use the `listOf` function (list cannot be changed)

`val newList = listOf("car", "truck", "van")`

To create editable lists use `mutableListOf(...)` instead

## Arrays (can't be edited, they are fixed in size)

Create using `arrayOf` or `intArrayOf` for an array of all numbers, etc

You can simply add arrays together with the + operator, it creates a new array

Initiallizing an array example.  `it` refers to the index

```
val array = Array (5) { it * 2 }
println(java.util.Arrays.toString(array))
```

## Looping example
```
for ((index, element) in school.withIndex()) {
    println("Item at $index is $element\n")
}
```

Short loop syntax for ranges `for (i in 1..5) print(i)`

repeate loops exist
```
repeat(2) {
    ...do something
}
```

## Everything returns value (except loops)
You can return the value of if statements!
```
val temperature = 10
val isHot = if (temperature > 50) true else false
println(isHot)
```

## Compact Functions
When a function returns the results of a single expression, you can specify the body of the function after an = symbol, omit the curly braces {}, and omit the return.

## Filters
```
// eager, creates a new list
val eager = decorations.filter { it [0] == 'p' }
println("eager: $eager")

// lazy, will wait until asked to evaluate
val filtered = decorations.asSequence().filter { it[0] == 'p' }
println("filtered: $filtered")

// force evaluation of the lazy list
val newList = filtered.toList()
println("new list: $newList")

val lazyMap = decorations.asSequence().map {
    println("access: $it")
    it
}
```

## Higher Order functions
pass in already established functions with a ::
```
higherOrderFunction(15, lambdaFunction)
higherOrderFunction(15, ::namedFunction)
```

[Last Parameter Call Syntax](https://kotlinlang.org/docs/reference/lambdas.html#passing-a-lambda-to-the-last-parameter)

## Classes
Props are declared in the parethesis of the constructor
use init blocks to handle more complex constructor logic
```
init {
    // stuff here
}
```

Use can create secondary constructors
```
constructor(numberOfFish: Int) : this() {
    // 2,000 cm^3 per fish + extra room so water doesn't spill
    val tank = numberOfFish * 2000 * 1.1
}
```

to subclass a class you must declare it as `open` (and it's props and methods)
to override a prop, use the `override` keyword

Singletons - use the `object` keyword
Interface delegations (advanced technique to read up)

Data Classes - use the `data` keyword before the `class` keyword

destructuring (note - vars/vals must be in order of declaration, and _ is used to skip a var)
`val (rock, wood, diver) = decoration`

## Data Extensions
tuples and triples are supported
you can link vals together
`val myTuple = "string" to "data"`

HashMaps can be used like associative arrays
There is a handy getOrDefault and getOrElse function

## Constants
Make them top level, with `const val` keyword it's created at compile time

Kotlin does not have a concept of class level constants.  You must use `companion` objects
```
class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}
```

You can add methods to classes, kind of like how JS allows you to.

## Generics
`in` and `out` keywords are available to help with generics

## Labeled loops and breaks
```
fun labels() {
    outerLoop@ for (i in 1..100) {
         print("$i ")
         for (j in 1..100) {
             if (i > 10) break@outerLoop  // breaks to outer loop
        }
    }
}
```

