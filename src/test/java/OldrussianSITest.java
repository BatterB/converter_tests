import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldrussianSITest {

    @Test
    void arshinToMeter() { assertEquals(0.7112, OldrussianSI.arshinToMeter(1.0)); }

    @Test
    void meterToArshin() {
        assertEquals(1.4060742407, OldrussianSI.meterToArshin(1.0));
    }

    @Test
    void funtToKilogramm() {
        assertEquals(0.409512, OldrussianSI.funtToKilogramm(1.0));
    }

    @Test
    void kilogrammToFunt() {
        assertEquals(2.4419307, OldrussianSI.kilogrammToFunt(1.0));
    }
}