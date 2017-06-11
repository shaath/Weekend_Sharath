package javaprogrammes;

import java.util.Scanner;


public class NestedIfEg {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
//		
//		int a=40;
//		int b=300;
//		int c=2000;
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if (a>b & a>c) 
		{
			System.out.println("A is greater");
		}
		else if (b > c & b > a) 
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
