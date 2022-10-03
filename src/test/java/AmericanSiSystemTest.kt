import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AmericanSiSystemTest {
    @Test
    fun shouldTransformToMeters(){
        val actual = AmericanSiSystem.yardToMeter(5.0F)
        val expected = 4.572F
        assertEquals(expected,actual)
    }

    @Test
    fun shouldTransformToYard(){
        val actual = AmericanSiSystem.meterToYard(4.572F)
        val expected = 4.98348F
        assertEquals(expected,actual)
    }

    @Test
    fun shouldTransformToKilo(){
        val actual = AmericanSiSystem.poundToKilogram(11F)
        val expected = 4.994F
        assertEquals(expected,actual)
    }

    @Test
    fun shouldTransformToPounds(){
        val actual = AmericanSiSystem.kilogramToPound(5F)
        val expected = 11F
        assertEquals(expected,actual)
    }

}