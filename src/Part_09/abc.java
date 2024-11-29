package Part_09;

import java.util.HashMap;
import java.util.Set;

public class abc
{
   public static void main(String[] args) 
   {
	   String s1="aba ab abab aba baba baba baba aba baba";
	   String []ar=s1.split(" ");
	   HashMap<String,Integer>mp=new HashMap<String,Integer>();
	   for(int i=0;i<=ar.length-1;i++)
	   {
		  String st=ar[i];
		  if(mp.containsKey(st))
		  {
			  mp.put(st,mp.get(st)+1);
		  }
		  else
		  {
			  mp.put(st, 1);
		  }
		  Set<String>allkeys=mp.keySet();
		  for(String s2:allkeys)
		  {
			  System.out.println(s2+" "+mp.get(s2));
		  }
		  for(String s2:allkeys)
		  {
			  if(mp.get(s2)>1)
			  {
				  System.out.println(s2+" "+mp.get(s2));
			  }
		  }
	   }
	   System.out.println(mp);
	   
}
}
