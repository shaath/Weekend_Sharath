package javaprogrammes;

public class StaticArrayEg1 {

	public static void main(String[] args) 
	{
		int[] s={40000,50000,60000,70000};
		
		//Length of the array
		System.out.println(s.length);
		//Reading the data from an array
//		System.out.println(s[2]);
//		for (int i = 0; i < s.length; i++) 
//		{
//			System.out.println(s[i]);
//		}
		
		for (int data : s) 
		{
			System.out.println(data);
			
		}
		
		

	}

}
