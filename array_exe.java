public class array_exe {
    public static void main(String[] args) {
        
        
        // : Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
        int[] numbers = {45, 22, 89, 16, 90, 33};
        
        

        // : Initialize min and max with the first element
        int min = 90; 
        int max = 90;

        // : Use an enhanced for loop to find min and max
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
             else if(i < min) {
                min = i;
                
            }
            else {
                
            }

        }

        // : Print the smallest and largest numbers
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}


