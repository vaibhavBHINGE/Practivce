package Java_8_Features;

@FunctionalInterface
interface Demo{
    void str ();
}
@FunctionalInterface
 interface Sum{
    void a (int i);
}
@FunctionalInterface
interface D{
    void v(int n,String b);
}
public class Lambda {
    public static void main(String []args){


        Demo d= ()-> System.out.println("Given is lambda expression ");
        d.str();


        Sum s=(i)->{System.out.println("given number is: "+i);};
        s.a(4);

        D a=(n,b)->{System.out.println("give int and string is: "+n+" "+b);};
        a.v(7,"Vaibhav");
    }

}
