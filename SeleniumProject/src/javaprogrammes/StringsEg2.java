package javaprogrammes;

public class StringsEg2 {

	public static void main(String[] args)
	{
		String s="Selenium";
		String s2="selenium";
		
		if (s.equalsIgnoreCase(s2)) 
		{
			System.out.println("Both the Strings are same");
		}
		else
		{
			System.out.println("Both the Strings are not same");
		}
	}

}
