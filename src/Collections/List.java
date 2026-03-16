package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class List {
    public static void main(String[]args)
    {

        // List is an interface which allows duplicate values, indexing, NULL values & it maintains the same order
    ArrayList<String> names= new ArrayList<String>();
// give arraylist is like a array but it can grow automatically
        names.add("Vaibhav");
        names.add("Ajit");
        names.add("Pranav");
        names.add("Shivam");
        names.add("Akshay");

//        for (String n: names){
//            System.out.println(n);
//        }
        System.out.println(names);

        // LinkedList: Data is stored in NODE. Node contains the data, info on previous and next element.
            LinkedList<Integer> no=new LinkedList<Integer>();
            no.add(1);
            no.add(2);
            no.add(3);

            for (int n: no){
                System.out.println(n);
            }

            //Vector: it's same as ArrayList but it's thread safe
        Vector<Float> v = new Vector<Float>();
            v.add(3.14f);
            System.out.println(v);

            // Stack: Follows the LIFO( Last In First Out)
        Stack<Double> stack = new Stack<>();
        stack.push(3.14);
        stack.push(123.12);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.peek();
        System.out.println(stack);
    }
}
