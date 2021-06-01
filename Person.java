package addressbook;
import java.util.ArrayList;
import java.util.*;

public class Person {

        ArrayList<String> p = new ArrayList<String>();
        public static Scanner sc = new Scanner(System.in);

        public static String getUserInput() {
            String fName,lName;
            String Address,city;
            String state;
            String zip,phone;
            String email;

            System.out.println("Enter first and last name:");
            fName = sc.next();
            lName = sc.next();
            System.out.println("Enter Address:");
            Address = sc.next();
            System.out.println("Enter City:");
            city = sc.next();
            System.out.println("Enter state:");
            state = sc.next();
            System.out.println("Enter zip:");
            zip = sc.next();
            System.out.println("Enter phone:");
            phone = sc.next();
            System.out.println("Enter email:");
            email = sc.next();

            ArrayList<String> p = new ArrayList<>();
            p.add(fName);
            p.add( lName);
            p.add( Address);
            p.add( city);
            p.add(state);
            p.add(zip);
            p.add( phone);
            p.add( email);

            System.out.println("Do you want to add contact in address book (Y/N)");
            return sc.next();
        }

    public static void main(String args[]) {

        System.out.println("Do you want to add contact in address book (Y/N)");
        String userDecision = sc.next();

        while(userDecision.equalsIgnoreCase("Y")) {
            userDecision = getUserInput();
        }


    }

}




