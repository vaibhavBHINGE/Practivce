package Oops;

interface Name{
    void friend();
    void age();
    String name="Vaibhav"; // we can add/declare variable inside the interface but they will be final adn static by default
    int age=23;
}
//class Unknown implements Name{
//    public void friend(){
//        System.out.println("friend name is ganesh");
//    }
//   public void age(){
//System.out.println("age is 12");
//    }
//}
public class Interface {
public static void main(String[]args){
    Name n=new Name() {

        public void friend() {
            System.out.println("Friend name is Harsh");
        }

        public void age() {
            System.out.println("age is 12");
        }
    };
n.age();
n.friend();
    String name = Name.name;
    int age = Name.age;
    System.out.println("Name and age from the interface class without declaring its object: "+name+" "+age);

}
}
