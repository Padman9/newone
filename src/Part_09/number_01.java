package Part_09;

public class number_01 
{
   public static void main(String[] args)
   {
	int sum=0,num,rem=0;
	System.out.println("Armstrong number is:");
	for(int i=0;i<500;i++)
	{
		num=i;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+(rem*rem*rem);
			
		}
		if(i==sum)
		{
			System.out.println(i);
		}
 
		sum=0;
	}
	System.out.println("------find given number is armstrong------");
	int num1=153;
	int sum1=0,rem2=0;
	for(int i=num1;i>0;i=i/10)
	{
		rem2=i%10;
		sum1=sum1+(rem2*rem2*rem2);
		
	}
	if(num1==sum1)
	{
		System.out.println("given number is armstrong");
	}
	else
	{
		System.out.println("givn number is not armstrong");
	}
	
   }
}