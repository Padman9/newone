package new_project;

public class vowels_INstring 
{
  public static void main(String[] args) 
  {
	String s1="welomesuso";
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("char at "+i+" char is "+ch);
		}
		
	}
	
}
}
