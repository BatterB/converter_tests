import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AmericanSiSystemTest {
    @Test
    fun shouldTransformToMeters(){
        val actual = AmericanSiSystem.yardToMeter(5.468F)
        val expected = 5.0F
        assertEquals(expected,actual)
    }

    @Test
    fun shouldTransformToYard(){
        val actual = AmericanSiSystem.meterToYard(4.572F)
        val expected = 5.0F
        assertEquals(expected,actual)
    }

    @Test
    fun shouldTransformToKilo(){
        val actual = AmericanSiSystem.poundToKilogram(11.023F)
        val expected = 5F
        assertEquals(expected,actual)
    }

    @Test
    fun shouldTransformToPounds(){
        val actual = AmericanSiSystem.kilogramToPound(5F)
        val expected = 11.023F
        assertEquals(expected,actual)
    }

}