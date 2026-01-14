package pac1;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person("Ritika", "Ruhal", 'f');
		

Scanner sc = new Scanner(System.in);
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();
        obj.setPhoneNumber(phone);
        
        System.out.println("Person Details:");
        System.out.println("First Name :"+obj.getFirstName());
        System.out.println("Last Name :"+obj.getLastName());
        System.out.println("Gender :"+obj.getGender());
        System.out.println("Phone Number : "+obj.getPhoneNumber());


	}

}
