package pac1;

class Balance
{
	String name;
	double bal;
	
	public Balance(String n,double b)
	{
		name=n;
		bal=b;
	}
	public void show()
	{
		if(bal>0) {
			System.out.println(name+":"+"$"+bal);
		}
	}
}

public class TC005_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Balance obj=new Balance("Ritika",70000000);
		obj.show();

	}

}
