@FunctionalInterface
interface A 
{
    void show(int i);
}

public class Example1{
    public static void main(String[] args) {
         
        A obj = i  -> System.out.println("Show in a " + i);
     obj.show(10);
    }
}