import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortingwithstring {
    public  static void main (String[] args){

        Comparator<String> com = new Comparator<String>()
        {
            @override
            public int compare(String s1 , String s2){
             return Integer.compare(s1.length(), s2.length());
            }

        };

        List<String>  name = new ArrayList<>();
        name.add("Pratap  ");
        name.add("Pratap Rajput");
        name.add("CHETPALSINGH");
        name.add("Kailash M Rajput");

         Collections.sort(name, com);


        System.out.println(name);
       
        

    }
}
