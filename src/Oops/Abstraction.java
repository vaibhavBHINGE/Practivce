package Oops;
abstract class Pen{
    abstract void colour();
    void type(){
        System.out.println ("this is the ballPen!");
    }
}

class ColourPen extends Pen{
    void colour(){
        System.out.println  ("pen colour is red");
    }
}
public class Abstraction {
    public static void main(String[]args){
        Pen p=new ColourPen();
        p.type();
        p.colour();
    }
}
