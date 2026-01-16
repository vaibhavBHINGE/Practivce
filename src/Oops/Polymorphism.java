package Oops;

import java.util.Scanner;

class Demo{
    int method(int a, int b){

        return (a+b);
    }
    int method (int a, int b, int c){
        return (a+b+c);
    }
}

public class Polymorphism {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a to add with b:");
        int a=sc.nextInt();
        System.out.println("Enter number b to add with a:");
        int b=sc.nextInt();
        System.out.println("Enter number c to add with a and b:");
        int c=sc.nextInt();
        Demo d=new Demo();

        int d1= d.method(a,b);
        int d2= d.method(a,b,c);
        System.out.println("Addition a and b is : "+d1);
        System.out.println("Addition of a,b and c is: "+d2);
    }
}
