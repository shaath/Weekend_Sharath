package javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args)
	{
		Object[] x=new Object[5];
		
		//Finding the length of the array
		System.out.println(x.length);
		
		//Writing the data into array
		x[2]=50000;
		x[0]="Selenium";
		x[2]="Apple";
		//Reading the data from an array
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}

	}

}
