package addressbook;
import java.util.ArrayList;

public class Person {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<String> p=new ArrayList<String>();

        p.add("Ashok");
        p.add("Ramesh");
        p.add("Patel");
        p.add("Ram");
        p.add("Sita");

        System.out.println(p);

        //Adding through index value
        p.add(3, "Syam");

        //Printing elements
        System.out.println(p);
    }
}



