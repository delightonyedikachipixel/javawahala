public class FourTriangle {

    public static void main(String[] args) {

        int rows = 5;
// to print all the triangles on the same line, have only 1 print statement not ln and the empty quote  with space. then at the end of the code have a println 
        
        for (int count = 1; count <= rows; count++) {
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        
        for (int count = rows; count >= 1; count--) {
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        
        for (int count = 1; count <= rows; count++) {

            for (int space = 1; space <= rows - count; space++) {
                System.out.print(" "); 
            }

            for (int star = 1; star <= count; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println();

        
        for (int count = rows; count >= 1; count--) {

            for (int space = 1; space <= rows - count; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= count; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
}

