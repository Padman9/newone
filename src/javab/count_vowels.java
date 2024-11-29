package javab;

public class count_vowels 
{
  public static void main(String[] args) 
  {
	String s1="Welcome";
	int count =0;
	for(int i=0;i<=s1.length()-1;i++)
	{
		char ch=s1.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
			count++;
			System.out.println("char position is: "+i+" char is "+ch);
				}
	}
	System.out.println(count);
}
}
