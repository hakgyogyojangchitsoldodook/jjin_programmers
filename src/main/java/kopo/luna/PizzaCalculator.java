package kopo.luna;

public class PizzaCalculator {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Solution(n));
    }
    static int Solution(int n) {
        if (n % 7 == 0) {
            return n / 7;
        } else {
            return n / 7 + 1;
        }
    }
}
