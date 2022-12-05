import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File in_Car = new File("/Users/iisuos/IdeaProjects/Kolok with test/kolok_test/src/main/java/dataCar.txt");
        File in_Ship = new File("/Users/iisuos/IdeaProjects/Kolok with test/kolok_test/src/main/java/dataShip.txt");
        File in_Airplane = new File("/Users/iisuos/IdeaProjects/Kolok with test/kolok_test/src/main/java/Airplane.java");
        DeviceCollector device = null;
        device = new CarVane(in_Car);
        System.out.println("Car says: " + device.predict());
        device = new Airplane(in_Airplane);
        System.out.println("Airplane says: " + device.predict());
        device = new Ship(in_Ship);
        System.out.println("Ship says: " + device.predict());
    }
}