package pac1;

import java.util.Scanner;

public class Lab8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        Person obj = new Person("Ritika", "Ruhal", (Gender) null);

        
        Gender g = null;
        while (g == null) {
            System.out.print("Enter Gender (M/F): ");
            String gInput = sc.nextLine().trim();
            g = Gender.fromInput(gInput);
            if (g == null) {
                System.out.println("Invalid input. Please enter only 'M' or 'F'.");
            }
        }
        obj.setGender(g);

        
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine().trim();
        obj.setPhoneNumber(phone);
        
        System.out.println("Person Details:");
        System.out.println("First Name :"+obj.getFirstName());
        System.out.println("Last Name :"+obj.getLastName());
        System.out.println("Gender :"+obj.getGender());
        System.out.println("Phone Number : "+obj.getPhoneNumber());


        sc.close();
    }
}


