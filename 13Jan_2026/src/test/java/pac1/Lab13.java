package pac1;


import java.time.LocalDate;
import java.util.Scanner;

public class Lab13 {
	 public static LocalDate warrantyExpiry(LocalDate purchaseDate, int years, int months) {
	        return purchaseDate.plusYears(years).plusMonths(months);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub   ///////

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase date (yyyy-MM-dd): ");
        LocalDate purchaseDate = LocalDate.parse(sc.nextLine());
        System.out.print("Enter warranty years: ");
        int years = Integer.parseInt(sc.nextLine());
        System.out.print("Enter warranty months: ");
        int months = Integer.parseInt(sc.nextLine());
        LocalDate expiry = warrantyExpiry(purchaseDate, years, months);
        System.out.println("Warranty expires on: " + expiry);
    }
}

