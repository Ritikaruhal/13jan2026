package pac1;

import java.util.Arrays;

public class TC_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr=new int[10];
		int a[]= {10,20,30};
		int twodim[][]=new int[4][5];
		
		int[] number;
		String[] name;
		
		int[] numbers1= {10,20,30,40,50};
		Arrays.sort(numbers1);
		System.out.println("after sorting:"+Arrays.toString(numbers1));
		
		System.out.println(numbers1[3]);
		System.out.println("Length:"+numbers1.length);
		
		for(int i=0;i<numbers1.length;i++) {
			System.out.println(numbers1[i]);
		}
		for(int value:numbers1)
		{
			System.out.println("Value:"+value);
		}
		int[] numbers2=new int[5];
		numbers2[0]=100;
		
		int[][] matrix= {{1,2,3},{4,5,6}};
		
		System.out.println(matrix[1][2]);
		System.out.println("Length:"+matrix.length);
	}
}