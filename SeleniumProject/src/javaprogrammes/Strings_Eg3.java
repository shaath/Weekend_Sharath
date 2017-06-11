package javaprogrammes;

public class Strings_Eg3 
{
	public static void main(String[] args)
	{
		String s="I am sharath";
		String s1="sharath";
		
		if (s.contains(s1)) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace(" ", "/"));
		
	}

}
