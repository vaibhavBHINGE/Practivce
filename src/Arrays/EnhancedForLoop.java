package Arrays;
class Student{
    int age;
    String name;
    int marks;
}
public class EnhancedForLoop {
    public static void main(String[]args){
Student s1=new Student();
s1.age=12;
s1.name="Vaibhav";
s1.marks=35;

Student s2=new Student();
s2.age=13;
s2.name="Vishal";
s2.marks=36;

Student s3 =new Student();
s3.age=14;
s3.name="vinay";
s3.marks=37;

Student[] std= new Student[3];
std [0]=s1;
std [1]=s2;
std [2]=s3;
  // implementation of enhanced for loop
        for( Student s: std){
System.out.println(s.name+" : "+s.age);
        }
}}
