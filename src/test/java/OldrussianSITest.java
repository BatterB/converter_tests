import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldrussianSITest {

    @Test
    void arshinToMeter() {
        assertEquals(1.0, OldrussianSI.arshinToMeter(2.0));
    }

    @Test
    void meterToArshin() {
        assertEquals(1.0, OldrussianSI.meterToArshin(2.0));
    }

    @Test
    void funtToKilogramm() {
        assertEquals(1.0, OldrussianSI.funtToKilogramm(2.0));
    }

    @Test
    void kilogrammToFunt() {
        assertEquals(1.0, OldrussianSI.kilogrammToFunt(2.0));
    }
}