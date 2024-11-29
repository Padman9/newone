package javab;

public class pattern_number_periamid 
{
	public static void main(String[] args)
	{
		int num=5;
		int z=1;
		for(int i=0;i<=num;i++)
		{
			for(int j=num-1;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=z;k++)
			{
				System.out.print(k);
			}
			System.out.println();
			z=z+2;
		}
	}

}
