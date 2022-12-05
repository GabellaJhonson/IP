import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public abstract class DeviceCollector {
    public ArrayList<Double> x = new ArrayList<Double>();;
    public ArrayList<Double> y = new ArrayList<Double>();
    public ArrayList<Double> power= new ArrayList<Double>();
    public ArrayList<Double> time = new ArrayList<Double>();  // sec
    DeviceCollector(File input) throws FileNotFoundException {
       Scanner scan = new Scanner(input);
        ArrayList<ArrayList<Double>> data = new ArrayList<ArrayList<Double>>();
       while(scan.hasNext()){
            String s = scan.nextLine();
            String[] st = s.split("[ ;,]+");
            ArrayList <Double> box = new ArrayList<Double>();
           for (String i: st) {
               box.add(Double.parseDouble(i));
           }
           data.add(box);
       }
       for (int i = 0; i < data.size(); i++) {
           for (int j = 0; j < 23; j++) {
               switch (j) {
                   case 14:
                       x.add(data.get(i).get(j));
                       break;
                   case 15:
                       y.add(data.get(i).get(j));
                       break;
                   case 2:
                       power.add(data.get(i).get(j));
                       break;
                   case 6:
                       time.add(data.get(i).get(j));
               }
           }
       }
    }
    public ArrayList<Double> filterCalman(ArrayList<Double> data){
        //// filtering
        return data;
    }
    public void processCoordinates(){
        x = this.filterCalman(x);
        y = this.filterCalman(y);
    }
    public void processPower(){
        power = this.filterCalman(power);
    }
    public void processWorkTime(){
        time = this.filterCalman(time);
    }
    abstract double predict();
}
