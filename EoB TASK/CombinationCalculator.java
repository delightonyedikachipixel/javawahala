public class CombinationCalculator {

    public static int getFactorialOfNumbers(int number) {
        int factorial = 1;
        for (int count = number; count >= 1; count--) {
            factorial = factorial * count;
        }
        return factorial;
    }

    public static int calculateCombination(int n, int r) {
        if (n > 9 || r > 9) {
            System.out.println("Numbers must be less than or equal to 9");
            return -1; 
        }

        if (r > n) {
            System.out.println("r cannot be greater than n");
            return -1;
        }

        return getFactorialOfNumbers(n) / (getFactorialOfNumbers(r) * getFactorialOfNumbers(n - r));
    }
}
