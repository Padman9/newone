package new_project;

import java.util.Scanner;

public class prime_number
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int num=sc.nextInt();
	int count=0;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			count=1;
		}
	}
	if(count==0)
	{
		System.out.println("number is prime number");
	}
	else
	{
		System.out.println("number is not prime");
	}
	
}
}
