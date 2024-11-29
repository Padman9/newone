package new_project;

import java.util.HashMap;
import java.util.Set;

public class Count_repeate_word
{
  public static void main(String[] args) 
  {
	String s1="ab ab abab baba ab bab abab baba";
	String []st=s1.split(" ");
	HashMap<String,Integer>mp=new HashMap<String,Integer>();
	for(int i=0;i<=st.length-1;i++)
	{
		String sa=st[i];
		if(mp.containsKey(sa))
		{
			mp.put(sa,mp.get(sa)+1);
		}
		else
		{
			mp.put(sa,1);
		}
		Set<String>allkeys=mp.keySet();
		for(String key:allkeys)
		{
			System.out.println(key+""+mp.get(key));
		}
//		for(String key:allkeys)
//		{
//			if(mp.get(key)>1) {
//			System.out.println(key+" "+mp.get(key));
//		}
		//}
		//System.out.println(mp);
	}
	
}
}
