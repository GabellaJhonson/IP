public class Main {
    public static void main(String[] args) {
       int n = 4;
       Facade fact = new Facade(n);
        System.out.println("Factorial " + n + ": " + fact.FactN() + '\n' +
                "First " + n + " factorials: " + fact.FactorialOfFirstN());
        }
}