package javab;

public class fabnacco_series 
{
   public static void main(String[] args) 
  {
	int a=0;
	int b=1;
	for(int i=0;i<=10;i++)
	{
		System.out.println(a+" ");
		int temp=a+b;
		a=b;
	     b=temp;
	}
}
}
