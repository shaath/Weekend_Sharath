package javaprogrammes;

public class ReverseStringEg {

	public static void main(String[] args) 
	{
		String s="Sharath";
		//Finding the length of a string
		int len=s.length();
		System.out.println(len);
		
//		System.out.println(s.charAt(3));

		System.out.println(s.substring(2, 6));
		for(int i=0;i< len; i++)
		{
			System.out.println(s.charAt(i));
			
		}
		System.out.println("*****");
		for (int i = len-1; i >= 0; i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
