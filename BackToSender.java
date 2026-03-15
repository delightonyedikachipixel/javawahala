import java.util.Scanner;

public class BackToSender{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("""

            Collection Rate    Amount per Parcel     Base Pay

             less than 50%         160                5000

              50%- 59%             200                5000
     
              60% - 69%            250                5000

              >= 70%               500                5000

""");






int BasePay = 5000;


System.out.println("Enter riders name:");
String ridersname = input.nextLine();


System.out.println("Enter number of successful deliveries:(please input integer digits only!)");
int numberofdeliveries = input.nextInt();


if (numberofdeliveries < 50){

    System.out.print(numberofdeliveries*160+BasePay);
}
else if (numberofdeliveries >= 50 && numberofdeliveries < 59 ){
    System.out.print(numberofdeliveries*200+BasePay);


}

else if (numberofdeliveries >= 60 && numberofdeliveries < 69 ){
    System.out.print(numberofdeliveries*250+BasePay);
}


else{

    System.out.print(numberofdeliveries*500+BasePay);
}





}
}
