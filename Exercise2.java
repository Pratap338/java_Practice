public class Exercise2 {
   public static void main(String[] args) {
       
        int score = 75;
        char grade = 'B';
        
        // : Check pass or fail
        if(score>50) {
         System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        // : Determine grade based on score
       if(score >= 90) {
         grade = 'A';
        }
        else if(score >= 75 && score <= 89) {
            grade = 'B';
        }
        else if(score >= 60 && score <= 74) {
            grade = 'C';
        }   
        else {
            grade = 'D';
        }
        System.out.println("Grade: " + grade);
   }
}