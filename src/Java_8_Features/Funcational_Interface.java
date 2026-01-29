package Java_8_Features;

// this is the Functional interface that means it can have only one abstract method


@FunctionalInterface
interface  Add{
void show();
}
class Cal implements Add{
   public void show(){
        System.out.println("in the show, using implements and creating new class we are showing this ");
    }
}
@FunctionalInterface
interface A{
    void fun();
}

public class Funcational_Interface {
    public static void main (String[]args){
        Add c=new Cal();
        c.show();
// using anonymous class
        A a=new A(){
            public void fun(){
                System.out.println("Using Anonymous class we are accessing functional interact");
            }
        };
        a.fun();
    }
}
