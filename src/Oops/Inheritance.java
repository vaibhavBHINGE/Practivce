package Oops;
import java.util.Scanner;

class Add {
    int add ( int a, int b)
    {
        return (a+b);
    }
}
class Sub extends Add{
    int sub (int a, int b)
    {
        return (a-b);
    }
}

public class Inheritance {
    public static void main(String []args){
        Sub sb=new Sub();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number a");
        int m= sc.nextInt();
        System.out.println("Enter number b");
        int mn= sc.nextInt();
        int a= sb.add(m,mn);
        int b=sb.sub(m,mn);
        System.out.println("Addition of given number: "+a);
        System.out.println("Substraction of given number: "+b);
    }
}
