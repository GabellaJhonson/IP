public class Factorial {
    private Integer answer;
    private int n;

    public Factorial(int n) {
        this.n = n;
        this.answer = 1;
        for (int i = 1; i <= n; i++){
            answer *= i;
        }
        if (n < 0) answer = 0;
    }

    @Override
    public String toString() {
        return answer.toString();
    }

    public int getAnswer() {
        return answer;
    }
}
