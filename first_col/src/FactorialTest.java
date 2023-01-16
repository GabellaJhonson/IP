import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FactorialTest {

    @Test
    void testToString() {
        Factorial temp = new Factorial(3);
        assertEquals ("6", temp.toString());
    }

    @Test
    void getAnswer_0() {
        Factorial temp = new Factorial(0);
        assertEquals (1, temp.getAnswer());
    }
    @Test
    void getAnswer_1() {
        Factorial temp = new Factorial(1);
        assertEquals (1, temp.getAnswer());
    }
    @Test
    void getAnswer_4() {
        Factorial temp = new Factorial(4);
        assertEquals (24, temp.getAnswer());
    }
    @Test
    void getAnswer_Negative() {
        Factorial temp = new Factorial(-1);
        assertEquals (0, temp.getAnswer());
    }
}