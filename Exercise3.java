public class Exercise3 {
    public static void main(String[] args) {
        // : Print numbers 1 to 5 using for loop
        System.out.print("For loop: ");
        for (int i = 1 ; i <= 5 ; i++  ){
            System.out.print(i + " " );
            
        }
        System.out.println();
         // : Print numbers 1 to 5 using while loop
        int i = 1;
        System.out.print("While Loop: ");
        while (i <= 5 ) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // : Print numbers 1 to 5 using do-while loop
        int j = 1 ;
        System.out.print("Do-While loop: ");
        do {
            System.out.print(j + " ");
            j++;
        } while (j<=5);
    }
}
