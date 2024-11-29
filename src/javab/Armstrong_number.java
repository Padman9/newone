package javab;

public class Armstrong_number 
{
  public static void main(String[] args) 
  {
	int sum=0,num,rem=0;
	System.out.println("armstrong number is:");
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
}
}
