package pac1;

import java.util.Scanner;

public class Lab9 {

    // Method to perform operation based on choice
    public static String performOperation(String str, int choice) {
        switch (choice) {
            case 1: // Add the String to itself
                return str + str;

            case 2: // Replace odd positions with '#'
                StringBuilder sb1 = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if ((i + 1) % 2 != 0) {
                        sb1.append('#');
                    } else {
                        sb1.append(str.charAt(i));
                    }
                }
                return sb1.toString();

            case 3: // Remove duplicate characters
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (sb2.indexOf(String.valueOf(c)) == -1) {
                        sb2.append(c);
                    }
                }
                return sb2.toString();

            case 4: // Change odd characters to upper case
                StringBuilder sb3 = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if ((i + 1) % 2 != 0) {
                        sb3.append(Character.toUpperCase(str.charAt(i)));
                    } else {
                        sb3.append(str.charAt(i));
                    }
                }
                return sb3.toString();

            default:
                return "Invalid choice!";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        System.out.println("Choose an operation:");
        System.out.println("1. Add the String to itself");
        System.out.println("2. Replace odd positions with '#'");
        System.out.println("3. Remove duplicate characters");
        System.out.println("4. Change odd characters to upper case");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        String result = performOperation(input, choice);
        System.out.println("Result: " + result);

        sc.close();
    }
}

