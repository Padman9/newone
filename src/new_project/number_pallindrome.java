package new_project;

public class number_pallindrome 
{
  public static void main(String[] args) 
  {
	
	  int a=235;
	  int b=a;
	  int rev=0;
	  while(a>0)
	  {
		  rev=rev*10+a%10;
		  a=a/10;
	  }
	  if(b==rev)
	  {
		  System.out.println("number is pallindrome");
	  }
	  else
	  {
		  System.out.println("number is not pallindrome");
	  }
	  
	  
}
}
