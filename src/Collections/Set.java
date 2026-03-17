package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[]args)
    {
//Set: set is an interface which does not allow duplicate values and no index based insertion

     HashSet<Integer> set=new HashSet<Integer>();
     // it does not allow  Duplicated alos don't prevent order
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);


        LinkedHashSet<Float> linkedHashSet= new LinkedHashSet<>();
        // it prevents order
        linkedHashSet.add(3.14f);
        linkedHashSet.add(12.2f);

        TreeSet<String> treeSet= new TreeSet<>();
        //It sorted order and no duplicated
        treeSet.add("Vaibhav");
        treeSet.add("Ajit");
        treeSet.add("Vaibhav");


    }
}
