package Oops;

// Encapsulation : binds data and method together this we can do using getter and setter

 class Human{
     int age;
     String name;

     void setAge(int a){
         age=a;
     }
     int geAge(){
         return age;
     }
     void setName(String n){
         name=n;
     }
     String getName(){
         return name;
     }
 }
public class Encapsulation {
     public static void main (String[]ages){
         Human h=new Human();
         h.setAge(24);
         h.setName("Amole");
         System.out.println(h.getName());
         System.out.println(h.geAge());
     }
}
