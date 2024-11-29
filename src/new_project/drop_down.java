package new_project;

import java.util.HashMap;
import java.util.Set;

public class drop_down 
{
	public static void main(String[] args) 
	{


int num=0,sum=0,rem=0;
System.out.println("Armstrong number :");
for(int i=0;i<=500;i++)
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