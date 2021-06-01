package addressbook;

import java.util.*;
	
	public class NoDuplicate_Entry 
	{
	
	
		public static List<HashMap<String,String>> personList = new ArrayList<HashMap<String,String>>();
		public static Scanner sc = new Scanner(System.in);
	
		public static String getUserInput()
		{
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
	
			HashMap<String,String> personDetails = new HashMap<>();
			personDetails.put("First Name",fName);
			personDetails.put("Last Name", lName);
			personDetails.put("Address", Address);
			personDetails.put("city", city);
			personDetails.put("State",state);
			personDetails.put("Zip", zip);
			personDetails.put("contact", phone);
			personDetails.put("email_Id", email);
	
			boolean personExist= false;
			for(HashMap<String,String> person: personList) {
				String emailId = person.get("email_Id");
				if(emailId.equalsIgnoreCase(email)) {
					personExist = true;
				}
			}
	
			if(personExist) {
				//
			} else {
				personList.add(personDetails);
			}
			System.out.println(personDetails);
			System.out.println("Do you want to add contact in address book (Y/N)");
			return sc.next();

		}
	
		public static void main(String args[]) {
	
			System.out.println("Do you want to add contact in address book (Y/N)");
			String userDecision = sc.next();
	
			while(userDecision.equalsIgnoreCase("Y")) {
				userDecision = getUserInput();
			}
			System.out.println(personList);
	
					
		}
	
	}
