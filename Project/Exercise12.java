import java.util.*;
import java.util.stream.*;

public class Exercise12 {
    public static void main(String[] args) {
        List<String> productNames = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // Filter, map, sort
        List<String> filteredProducts = productNames.stream()
            .filter(name -> name.length() > 5)
            .map(String::toUpperCase)
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Original List:  " + productNames);
        System.out.println("Filtered Products:  " + filteredProducts);
    }
}
