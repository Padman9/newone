package javab;

public class number_pallindrome
{
	public static void main(String[] args) {
		
	
   int a=122;
   int b=a;
   int rev=0;
   while(a>0)
   {
	   rev=rev*10+a%10;
	   a=a/10;
	   
   }
   if(rev==b)
   {
	   System.out.println(b+" number is pallindrome");
   }
   else
   {
	   System.out.println(b+" number is not pallindrome");
   }
}
}

