import java.io.File;
import java.io.FileNotFoundException;

public class Ship extends DeviceCollector{
    Ship(File input) throws FileNotFoundException {
        super(input);
    }
    @Override
    double predict() {
        this.processCoordinates();
        this.processPower();
        this.processWorkTime();
        double result = 0;
        ////  processing with algorithms
        return result + 0.3;
    }
}
