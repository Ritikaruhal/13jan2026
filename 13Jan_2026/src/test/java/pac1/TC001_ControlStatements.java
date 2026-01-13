package pac1;

public class TC001_ControlStatements {
	int num= 2000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("odd Number");
		}
		int day=3;
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		}
		
		for(int i=1; i<=5;i++)
		{
			System.out.print(i);
		}
		
		int j=1;
		while(j<=2)
		{
			System.out.println(j);
			j++;
		}
		
		int k=1;
		do
		{
			System.out.print(k);
			k++;
			
		}while(k<=5);
		
		}
		

	}


