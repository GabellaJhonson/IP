import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class ShipTest extends TestCase {

    @Test
    public void testPredict() throws FileNotFoundException {
        File test = new File("/Users/iisuos/IdeaProjects/Kolok with test/kolok_test/src/test/java/dataTest.txt");
        DeviceCollector device = null;
        device = new Ship(test);
        assertEquals(device.predict(), 0.3);
    }
}