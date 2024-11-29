package Part_09;

import java.util.Arrays;

public class revrse_ineven_odd
{
   
	
	static String revrse(String str)
	  {
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		return rev;  
	  }
	
	public static void main(String[] args) 
   {
	  String st="my name is rohit";
	  String []sd=st.split(" ");
	  for(int i=0;i<=sd.length-1;i++)
	  {
		  String str=sd[i];
		  if(i%2==0)
		  {
			  System.out.print(revrse(str)+" ");
		  }
		  else
		  {
			  System.out.print(str+" ");
		  }
	  }
	  System.out.println();
	  System.out.println("-------");
	  int a[]={12,65,42,21,32,11};
      Arrays.sort(a);
      
     int len=a.length;
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
     System.out.println("highest number "+a[len-2]);
   
}
}
