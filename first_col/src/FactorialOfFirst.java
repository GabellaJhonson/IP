import java.util.ArrayList;
import java.util.List;

public class FactorialOfFirst {
   private ArrayList<Integer> arr = new ArrayList<Integer>();
   private int n;

    public FactorialOfFirst(int n) {
        this.n = n;
        int answer;
        answer = 1;
        if(n > 0) arr.add(1);
        for (int i = 1; i < n; i++){
            answer *= i;
            arr.add(answer);
        }
    }
    @Override
    public String toString() {
        String s = "";
        for (Integer i: arr){
            s += i.toString() + " ";
        }
        return s;
    }
}
