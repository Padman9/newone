package javab;

public class find_armstrong_number 
{
  public static void main(String[] args) 
  {
	int num=413;
	int rem=0,sum=0;
	for(int i=num;i>0;i=i/10)
	{
		rem=i%10;
		 sum=sum+(rem*rem*rem);
	}
	if(num==sum)
	{
		System.out.println("given "+num+" is armstrong");
	}
	else
	{
		System.out.println("given "+num+" is not armstrong");
	}
}
}
