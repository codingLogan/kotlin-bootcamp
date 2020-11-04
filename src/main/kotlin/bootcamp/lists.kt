package bootcamp

fun addNullToList(list: MutableList<Int?>): MutableList<Int?> {
    // Given a blank list, add 2 null values to it
    list.add(null)
    list.add(null)
    return list
}

fun accessFirstListItem(list: List<Int>): Int {
    // Return the first list item
    return list.first()
}