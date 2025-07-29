import java.util.*;

public class Exercise11 {
    
    public static void main(String[] args){
        
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
        
        // TODO: Print the original list
        System.out.println("Original List: " +  names);
        // TODO: Convert the list to a LinkedHashSet to remove duplicates while preserving order
        Set<String> linkedHashSet = new java.util.LinkedHashSet<>(names);



        // TODO: Print the set of unique names
        System.out.println("Unique Names: " + linkedHashSet);
    }

}