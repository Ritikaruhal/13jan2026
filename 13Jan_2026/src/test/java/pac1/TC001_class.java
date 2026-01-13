package pac1;

class Box
{
	double width=20;
	double height=10;
	double depth=5;
	
	double calvolume()
	{
		return width*height*depth;
	}
}

public class TC001_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj=new Box();
		System.out.println(obj.calvolume());

	}

}
