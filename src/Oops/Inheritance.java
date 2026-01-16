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
class Mul extends Sub {
    int mul(int a, int b)
    {
        return (a*b);
    }
}
class Div extends Mul{
    int div(int a, int b)
    {
        return (a/b);
    }
}
public class Inheritance {
    public static void main(String []args){
//        Sub sb=new Sub();
        Div mm=new Div();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number a");
        int m= sc.nextInt();
        System.out.println("Enter number b");
        int mn= sc.nextInt();
        int a= mm.add(m,mn);
        int b=mm.sub(m,mn);
        int ml=mm.mul(m,mn);
        int dv=mm.div(m,mn);
        System.out.println("Addition of given number: "+a);
        System.out.println("Substraction of given number: "+b);
        System.out.println("Multiplication of given number: "+ml);
        System.out.println("Divination of given number: "+dv);


    }
}
