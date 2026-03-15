public class Rubbish{
    public static void main (String []args){



 for(int count = 1; count <= 10; count++){
    
int product = 1;
    for (int index = 1; index <= 5; index++){

        if (count % 4 == 0){

        product = product * count;

        System.out.print(product+ " ");
    }

    }
}
}
}
