package javaprogrammes;

public class WhileLoopEg {

	public static void main(String[] args) 
	{
		int i=1;
		while (i<=500)
		{
			if (i>350) 
			{
				break;
			}
			System.out.println(i);
			
			i++;
		}

	}

}
