package new_project;

import java.util.Scanner;

public class Array_in 
{
	public static void main(String[] args) 
	{
		int [][]ar=new int [2][3];
		ar[0][0]=1;
		ar[0][1]=2;
		ar[0][2]=3;
		ar[1][0]=4;
		ar[1][1]=5;
		ar[1][2]=6;
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	 
}

