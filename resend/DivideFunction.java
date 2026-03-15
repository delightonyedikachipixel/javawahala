public class DivideFunction {
    
    private static int divideNumbers(int a, int b) {
        int result = 0;
        
        while (a >= b) {
            a = a - b;
            result = result + 1;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(divideNumbers(10, 2));  
        System.out.println(divideNumbers(9, 3));   
        System.out.println(divideNumbers(20, 4));  
    }
}
