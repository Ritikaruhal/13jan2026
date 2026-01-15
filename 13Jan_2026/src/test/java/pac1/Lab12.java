package pac1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class Lab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());
        System.out.print("Enter second date (yyyy-mm-dd): ");

LocalDate date2 = LocalDate.parse(sc.nextLine());
        Period diff = Period.between(date1, date2);
        System.out.println("Years: " + diff.getYears());
        System.out.println("Months: " + diff.getMonths());
        System.out.println("Days: " + diff.getDays());

	}

}
