import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        String reversed = "";


        for(int wordCount= word.length()-1;wordCount >= 0; wordCount--){

            reversed += word.charAt(wordCount);

}

        System.out.println(reversed);


}
}
