package kopo.luna;

public class PizzaCalculator2 {
    public static void main(String[] args) {
        int slice = 7;
        int n = 10;
        System.out.println(Solution(slice, n));
    }
    static  int Solution(int slice, int n) {
        return ((n - 1) / slice) + 1;
    }
}
