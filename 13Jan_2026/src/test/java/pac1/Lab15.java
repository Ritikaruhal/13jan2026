package pac1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab15 {
	// TODO Auto-generated method stub ///
    public static int CalculateAge(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public static String getFullName(String firstName, String lastName) {
        return (firstName == null ? "" : firstName.trim()) + " " + (lastName == null ? "" : lastName.trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        LocalDate dob = LocalDate.parse(sc.nextLine());
        String fullName = getFullName(firstName, lastName);
        int age = CalculateAge(dob);
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age + " years");
    }
}
