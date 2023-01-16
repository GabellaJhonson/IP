import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    void factN() {
        Facade temp = new Facade(3);
        assertEquals ("6", temp.FactN());
    }

    @Test
    void factorialOfFirstN() {
        Facade temp = new Facade(4);
        assertEquals("1 1 2 6 ", temp.FactorialOfFirstN());
    }
}