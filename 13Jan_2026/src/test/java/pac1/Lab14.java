package pac1;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab14 {
	// TODO Auto-generated method stub 
    public static void printDateTimeForZone(String zoneId) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current date and time in " + zoneId + ": " + zonedDateTime.format(formatter));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Zone ID (e.g., America/New_York, Europe/London, Asia/Tokyo): ");
        String zoneId = sc.nextLine();
        try {
            printDateTimeForZone(zoneId);
        } catch (Exception e) {
            System.out.println("Invalid Zone ID. Please try again.");
        }
    }
}

