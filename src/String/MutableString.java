package String;

public class MutableString {
    public static void main(String []args){
// Both StringBuffer and StringBuilder and both uses same function lib. but at the level of theory there are some differences as follows:
// Buffer is ThreadSafer(Synchronized)also this is Multithreaded as builder is single, Builder is Unsynchronized that makes faster than buffer

        StringBuffer stringBuffer= new StringBuffer("Vaibhav");

//     Method	Description
//    append()	Adds text at the end
//    insert()	Inserts text at a specific index
//    delete()	Removes characters
//    replace()	Replaces characters
//    reverse()	Reverses the string
//    length()	Returns length
        System.out.println(stringBuffer);
        stringBuffer.append(" Bhinge");
        System.out.println(stringBuffer);
        stringBuffer.insert(7,7);
        System.out.println(stringBuffer);
        stringBuffer.delete(7,8);
        System.out.println(stringBuffer);
        stringBuffer.replace(0,7,"Ajit");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println("Length of the given string: "+stringBuffer.length());

    }

}
