package pac1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = sc.nextLine();
        LocalDate givenDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();
        Period diff = Period.between(givenDate, currentDate);

System.out.println("Years: " + diff.getYears());
        System.out.println("Months: " + diff.getMonths());
	}

}
