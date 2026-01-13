package pac1;

import java.util.Scanner;

public class TC004_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		System.out.println("Your name is:"+ name);
		System.out.println("Enter number");
		int n = sc.nextInt();
		if (n<0)
		{
			System.out.println("its negative");
		}
		else
		{
			System.out.println("positive");
		}
		
		

	}

}
