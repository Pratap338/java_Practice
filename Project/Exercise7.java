public class Exercise7 {
    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 0;
        
        // : Handle division using try-catch
        
        try{
             numerator = numerator/ denominator;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program completed");
    }
}
