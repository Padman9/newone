package javab;

import java.util.HashMap;
import java.util.TreeMap;

public class Revrse_StringPallindrome 
{
	
public static void main(String[] args) 
{
	String s1="Software QA Engineer";
	String s2="";
	String st[]=s1.split(" ");
	
	for(int i=st.length-1;i>=0;i--)  //adding the "=" for total equal number of char
	{
		System.out.print(st[i]+" ");
		
	}
System.out.println(s2);

	if(s2.equals(s1))
	{
		System.out.println("string is pallindrome");
	}
	else 
	{
		System.out.println("string is not pallindrome");
	}
	
	TreeMap<Integer,String>mp =new TreeMap<>();
	mp.put(1, "sagar");
	mp.put(1, "sagar");
	mp.put(2,"nitin");
	System.out.println(mp);
}
}
