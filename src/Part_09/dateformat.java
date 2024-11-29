
package Part_09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class dateformat
{
   
	
	static void removeduplicate(char s1[],int n)
	{
		HashSet<Character> hst=new LinkedHashSet<>(n-1);
		
		//hashset doesn't allow repetation element
		for(char x:s1)
			hst.add(x);
	
		//print the set
		for(char x:hst)
			System.out.print(x+" ");	
		
	}
	
	
	public static void main(String[] args) 
   {

		System.out.println("-----remove the duplicate char in string-----");
	   
	  char s1[]="saturdayr".toCharArray();
	int  n=s1.length;
	removeduplicate(s1,n);
	   
	   
}
}
