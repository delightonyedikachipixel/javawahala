import java.util.Scanner;
public class Reverse{
    public static void main (String[]args){

    Scanner input = new Scanner(System.in);
System.out.println("Enter a string:");
String text = input.nextLine();

 String reversed = "";
    for (int counter = text.length() - 1; counter >= 0; counter--) {
            reversed += text.charAt(counter);

}
     
   System.out.print (reversed);




}
}

