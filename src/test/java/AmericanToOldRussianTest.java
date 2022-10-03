import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmericanToOldRussianTest {

    @Test
    void yardToArshin() {
        assertEquals(1.0, AmericanToOldRussian.yardToArshin(2.0));
    }

    @Test
    void arshinToYard() {
        assertEquals(1.0, AmericanToOldRussian.arshinToYard(2.0));
    }

    @Test
    void russianPoundToAmericanPound() {
        assertEquals(1.0, AmericanToOldRussian.russianPoundToAmericanPound(2.0));
    }

    @Test
    void americanPoundToRussianPound() {
        assertEquals(1.0, AmericanToOldRussian.americanPoundToRussianPound(2.0));
    }
}