import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmericanToOldRussianTest {

    @Test
    void yardToArshin() {
        assertEquals(2.5714286, AmericanToOldRussian.yardToArshin(2.0));
    }

    @Test
    void arshinToYard() {
        assertEquals(1.555555538, AmericanToOldRussian.arshinToYard(2.0));
    }

    @Test
    void russianPoundToAmericanPound() {
        assertEquals(1.805639028, AmericanToOldRussian.russianPoundToAmericanPound(2.0));
    }

    @Test
    void americanPoundToRussianPound() {
        assertEquals(2.2152822, AmericanToOldRussian.americanPoundToRussianPound(2.0));
    }
}