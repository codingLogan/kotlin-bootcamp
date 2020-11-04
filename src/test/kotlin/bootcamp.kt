import bootcamp.*
import kotlin.test.*

class BootCampTest {
    @Test
    fun testAddition() {
        assertEquals(3, doAddition(1,2))
    }

    @Test
    fun testSubtraction() {
        assertEquals(-1, doSubtraction(1, 2))
    }

    @Test
    fun testElvisOperator() {
        assertEquals("10", doElvisOperation(10))
        assertEquals("elvis operator", doElvisOperation(null))
    }

    @Test
    fun testList() {
        val expectedList = mutableListOf<Int?>(null, null)
        val actualList = mutableListOf<Int?>()
        assertEquals(expectedList, addNullToList(actualList))

        val expectedItem = 99
        val testList = listOf(expectedItem, 11)
        assertEquals(expectedItem, accessFirstListItem(testList))
    }

    @Test
    fun testStrings() {
        assertEquals("First Middle Last", stringConcat("First", "Last"))
        assertEquals("10 + 9 = 19 fish", expressionConcat(10, 9))
    }

    @Test
    fun testWhenFlow() {
        assertEquals("zero", testWhen(0))
        assertEquals("less than 10", testWhen(2))
        assertEquals("plenty", testWhen(99))
    }
}