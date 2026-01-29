package Java_8_Features;

// this is the Functional interface that means it can have only one abstract method


@FunctionalInterface
interface  Add{
void show();
}
class Cal implements Add{
   public void show(){
        System.out.println("in the show");
    }
}


public class Funcational_Interface {
    public static void main (String[]args){
        Add c=new Cal();
        c.show();
    }
}
