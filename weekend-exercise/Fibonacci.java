public class Fibonacci {
    public static void main(String[] args) {

        int first = 0;  
        int second = 1; 
        int count = 1;  

        while (count <= 20) {

            System.out.print(first + " ");

            int next = first + second; 
            first = second;            
            second = next;             
            count++; 
        }
    }
}
