package javab;

public class Revrse_number_withoutString
{
  public static void main(String[] args) 
  {
	int num=54931;
	int rev=0;
	for(int i=num;i>0;i=i/10)
	{
		int rem=i%10;
		rev=rev*10+rem;
	}
	System.out.println(rev);
}
}
