public class Example2 {
    public  static  void main (String a[])
    {
        int i = 2;
        int j = 0;
        try {
            j = 18/i;
            System.out.println("try ");
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        finally
        {
            System.out.println("I will get prited");
            
        }



    }
}
