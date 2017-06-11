package javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		
		x.add("Selenium");
		x.add("UFT");
		x.add(true);
		x.add(50000);
		x.add(true);
		x.add(2, "Apple");
		
		//Finding the size of the arraylist
		System.out.println(x.size());

		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}
	}

}
