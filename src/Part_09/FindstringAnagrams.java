package Part_09;

import java.util.Arrays;

public class FindstringAnagrams 
{
	public static void main(String[] args) 
	{
		String s1="listen";                  //find the character in string is same or not
		                                     // order of char is not consider
		String s2="silent";                  
		  char []ch1=s1.toCharArray();
		  char []ch2=s2.toCharArray();
		  Arrays.sort(ch1);
		  Arrays.sort(ch2);
		  
		  if(Arrays.equals(ch1, ch2))
		  {
			  System.out.println("string is Anagram");
		  }
		  else
		  {
			  System.out.println("string is Not Anagram");
		  }
	}

}
