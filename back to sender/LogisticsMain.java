import java.util.Scanner;

public class LogisticsMain{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("""

            Collection Rate    Amount per Parcel     Base Pay

             less than 50%         160                5000

              50%- 59%             200                5000
     
              60% - 69%            250                5000

              >= 70%               500                5000

""");





System.out.println("Enter riders name:");
String ridersname = input.nextLine();


System.out.println("Enter number of collection rate:(please input integer digits only!)");
int collectionrate = input.nextInt();

int wage = LogisticsLogic.getRiderWage(collectionrate);

System.out.println("Rider Name: " + ridersname);
System.out.println("Rider Wage: " + wage);
}
}
