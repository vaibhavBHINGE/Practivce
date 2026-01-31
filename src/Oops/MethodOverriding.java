package Oops;


class Backend {
    String developer(){
        return "I know java so i am backend developer";
    }
}
class FullStackDeveloper extends Backend{
    String developer(){
        return "I know java & react so i am FullStackDeveloper developer";
    }
}
public class MethodOverriding {
    public static void main(String[]args) {
        FullStackDeveloper f = new FullStackDeveloper();
        String s=f.developer();
        System.out.println(s);
    }
}

