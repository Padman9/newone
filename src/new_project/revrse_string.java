package new_project;

import java.util.Scanner;

public class revrse_string 
{
   public static void main(String[] args) 
   {
	String s1="abhijeet";
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		s2=s2+s1.charAt(i);
	}
	System.out.println("revrse string: "+s2);
	System.out.println("original string: "+s1);
	
	 
	
	 }
   }


