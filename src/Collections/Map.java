package Collections;

import java.util.HashMap;

public class Map {
    public static void main(String[]args)
    {
        // Map is used to store values in the form of key value pair
        HashMap<String, Integer> age =new HashMap<String, Integer>();
        age.put("Vaibhav",24);
        age.put("Ajit",14);
        age.put("Ganesh",5);
        age.put("Vishal",44);
        age.put("Amol",31);

       System.out.println(age);
    }

}
