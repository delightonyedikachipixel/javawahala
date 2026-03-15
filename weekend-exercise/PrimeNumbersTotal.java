public class PrimeNumbersTotal {
    public static void main(String[] args) {

        int totalPrimes = 0;  

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int count = 2; count <= num / 2; count++) {  
                if (num % count == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                totalPrimes++; 
            }
        }

        System.out.println(totalPrimes);
    }
}
