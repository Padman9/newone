package Part_09;

import java.util.Arrays;

public class arraysort 
{
  public static void main(String[] args)
{
	int []a= {45,62,24,71,15,34,26,96,21,11};
	for (int i = 0; i < a.length; i++) 
	{                                        //sort array without using sort method
		for (int j = i + 1; j < a.length; j++)
		{
			if (a[i] > a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		System.out.println(a[i]);
	}
	
	System.out.println("---------using sort method----------");
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
}
}
