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
}