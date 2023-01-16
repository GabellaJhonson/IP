import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialOfFirstTest {

    @Test
    void testToString_0() {
        FactorialOfFirst temp = new FactorialOfFirst(0);
        assertEquals("", temp.toString());
    }
    @Test
    void testToString_1() {
        FactorialOfFirst temp = new FactorialOfFirst(1);
        assertEquals("1 ", temp.toString());
    }
    @Test
    void testToString_4() {
        FactorialOfFirst temp = new FactorialOfFirst(4);
        assertEquals("1 1 2 6 ", temp.toString());
    }
    @Test
    void testToString_Negative() {
        FactorialOfFirst temp = new FactorialOfFirst(-1);
        assertEquals("", temp.toString());
    }
}