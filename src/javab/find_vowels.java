package javab;

public class find_vowels 
{
  public static void main(String[] args) 
  {
	String s1="welcome";
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("char position is: "+i+" char is "+ch);
		}
	}
}
}
