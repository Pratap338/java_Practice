 class Innerexp {
    int n = 10;
    String print =  "Hello WOrld + 0000 ";
    public void show ()
    {
        System.out.println("Pratap");
    }
    
    
}

public class exp {
    public static void main(String[] args) {
        Innerexp obj = new Innerexp();
    // System.out.println("Hii" + obj.n); 
    System.out.println(obj.print);
    obj.show();
    }
   
}
