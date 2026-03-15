import java.util.Scanner;
public class ReverseInteger{
    public static void main (String[]args){

    Scanner input = new Scanner(System.in);
System.out.println("Enter a number:");
String number = input.nextLine();

 String Reversed = "";
    for (int counter = number.length() - 1; counter >= 0; counter--) {
            Reversed += number.charAt(counter);

}
     
   System.out.print (Reversed);




}
}

