package Part_09;

import java.util.HashSet;
import java.util.Set;

public class array_fun
{
   public static void main(String[] args) 
   {
	
	   int ar[]= {12,15,47,64,21,11,7,9,32,11,12};
	   int temp=0;
	   for(int i=0;i<ar.length;i++)
	   {
		   for(int j=1+i;j<ar.length;j++)
		   {
			   if(ar[i]>ar[j])
			   {
				   temp=ar[i];
				   ar[i]=ar[j];
				   ar[j]=temp;
			   }
		   }
	   }
	   for(int i=0;i<ar.length;i++)
	   {
		   System.out.println(ar[i]);
	   }
	  System.out.println("--------------maximum word in sentance-------------------");
	   String s1="my happiest song is albella";
	   String maxword = "";
	   String []at=s1.split(" ");
	   for(int i=0;i<=at.length-1;i++)
	   {
		   if(at[i].length()>=maxword.length())
		   {
			   maxword=at[i];
		   }
		  
	   }
	   System.out.println(maxword);
	   System.out.println("----------------print number before decimal--------------");
	   double num=12346.26;
	   int interpart=(int) num;
	   System.out.println(interpart);
	   System.out.println("--------------remove duplicate element------------");
	
	   Set st=new HashSet();
	   int i=0;
	   st.add(ar[i]);
	   System.out.println(st);
}
}
