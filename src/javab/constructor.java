package javab;

public class constructor
{	
	 constructor()
	   {  
		   this(5);
		   System.out.println("first constructor");
	   }
	   constructor(int b)
	   {
		   this(5,7);
		   System.out.println("2nd constructor");
	   }
	   constructor(int a,int c)
	   {
		  // this();
		   System.out.println("3rd constuctor");
	   }
   public static void main(String[] args)
   {
	String s1="Engineering";
	int []counter=new int[256];
	for(int i=0;i<=s1.length()-1;i++)
	{
		counter[(int)s1.charAt(i)]++;
	}
	for(int i=0;i<256;i++)
	{
		if(counter[i]!=0)
		{
			System.out.println((char)i+" "+counter[i]);
		}
	}
	
 // sample32 ss=new sample32(2);
  
  
	
	
}
	
   }



