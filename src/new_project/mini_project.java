package new_project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class mini_project
{
   public static void main(String[] args) 
   {
	String s1="ba bab baba baba ab ab baba ba";
	String ar[]=s1.split(" ");
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
			mp.put(st,1);
		}
		Set<String>allkeys=mp.keySet();
		for(String key:allkeys)
		{
			System.out.println(key+" "+mp.get(key));
		}
		for(String key:allkeys)
		{
			if(mp.get(key)>1)
			{
			System.out.println(key+" "+mp.get(key));
			}
		}
	}
	System.out.println(mp);
	
	
   }
}
	   


