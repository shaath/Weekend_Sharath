package javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={"Selenium",3333.55,4444,'C',true};
		
		System.out.println(x.length);
		
		for (Object data : x)
		{
			System.out.println(data);
		}
	}

}
