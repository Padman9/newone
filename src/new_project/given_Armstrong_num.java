package new_project;

public class given_Armstrong_num 
{
  public static void main(String[] args) 
  {
	int num=153;
	int rev=0;
	for(int i=num;i>0;i=i/10)
	{
		int rem=i%10;
		 rev=rev+(rem*rem*rem);
	}
	if(num==rev)
	{
		System.out.println("given number "+num+" is armstrong");
	}
	else
	{
		System.out.println("number is not armtsong");
	}
}
}
