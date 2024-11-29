package Part_09;

public class number_s03 
{
	public static void main(String[] args)
	{	
   int num=123456;
   int rev=0;
   for(int i=num;i>0;i=i/10)
  {
	  int rem=i%10;
	  rev=rev*10+rem;
  }
    System.out.println("revrse number is :"+rev);
    
    System.out.println("-----------------revrse string------------------------");
    
    String s1="revrse the string";
    String s2="";
    for(int i=s1.length()-1;i>=0;i--)
    {
    	s2=s2+s1.charAt(i);
    }
    System.out.println(s2);
    
    System.out.println("-------revrse the string with only word-------------------");
    
    
    String s="My Country is India";
      String []ar=s.split(" ");
      for(int i=ar.length-1;i>=0;i--)
      {
    	  System.out.print(ar[i]+" ");
      }
      System.out.println();
      System.out.println("---------------upper and lower case---------------------");
   
      
      String up="My Name is Rohit";
       int len=up.length();
       StringBuffer sb=new StringBuffer(len);
       for(int i=0;i<=len-1;i++)
       {
    	  char c= up.charAt(i);
    	   if(Character.isUpperCase(c))
    	   {
    		   c=Character.toLowerCase(c);   
    	   }
    	   else if(Character.isLowerCase(c))
    	   {
    		   c=Character.toUpperCase(c);
    	   }
    	   sb.append(c);
    	 
       }
          String bad= sb.toString();
    	   System.out.println(bad);
    	   System.out.println();
    	   System.out.println("------------------number pattern-----------------------");
    	   int no=1;
     for(int i=1;i<=5;i++)
     {
    	 for(int j=1;j<=i;j++)
    	 {
    		 System.out.print(no+" ");
    		 no++;
    	 }
    	 System.out.println(" ");
     }
     System.out.println();
     System.out.println("----------------fabbonacci series---------------------");
     int a=0;
     int b=1;
     for(int x=0;x<=10;x++)
     {
    	 System.out.print(a+" ");
    	 int temp=a+b;
    	 a=b;
    	b=temp;
     }
     
    	   
       }
}
