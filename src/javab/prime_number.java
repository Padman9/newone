package javab;

public class prime_number 
{
  public static void main(String[] args) 
  {
	int c=0,count=0;
	for(int i=0;i<=100;i++) 
	{
		count=0;
		for(int j=2;j<i/2;j++)
		{
			if(i%j==0)
			{
				//for the getting the number from 
			//	count=1;
				//for count the number 
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(i);
			//for the adding the count the number
			c++;
		}
	}
	System.out.println("total number "+c);
}
}
