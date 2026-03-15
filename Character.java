import java.util.Scanner;
public class Character{
public static void main(String[]args){
Scanner typein = new Scanner(System.in);

String result = "";

System.out.println("Enter a word:");
String word = typein.nextLine();


System.out.println("Enter a number:");
int number = typein.nextInt();



    for (int count = 0; count < word.length(); count++) {
            for (int counter = 0; counter < number; counter++) {
                result += word.charAt(count);
       }
        }

            System.out.println(result);
}
  }
  
