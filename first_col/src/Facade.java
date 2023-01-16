public class Facade {
    private int n;

    public Facade(int n) {
        this.n = n;
    }

    public String FactN() {
        Factorial temp = new Factorial(n);
        return temp.toString();
    }
    public String FactorialOfFirstN() {
        FactorialOfFirst temp = new FactorialOfFirst(n);
        return temp.toString();
    }
}
