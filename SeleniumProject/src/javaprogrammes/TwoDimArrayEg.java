package javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		Object[][] s=new Object[2][3];
		
		//Finding the size of the rows
		System.out.println("The number of rows "+s.length);
		//Finding the length of columns
		System.out.println("The number of columns "+s[1].length);

		//Writing the data into array
		s[0][2]="Selenium";
		s[1][1]="QEdge";
		
//		System.out.println(s[0][2]);
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s[i].length; j++) 
			{
				System.out.println(s[i][j]);
			}
		}
	}

}
