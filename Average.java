public class Average {
    public static void main(String[] args) {
        int sum = 0; 

        for (int count = 1; count <= 100; count++) {
            sum += count; 
        }

        double average = sum / 100.0; 

        
        System.out.println( average);
    }
}
