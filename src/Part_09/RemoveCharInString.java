package Part_09;

public class RemoveCharInString
{
  public static void main(String[] args) 
  {
	String word="abbccdaaaee";
	
	StringBuilder sb=new StringBuilder(word.length());
	boolean []s=new boolean[256];
	
	for(int i=0;i<word.length();i++)
	{
		char c=word.charAt(i);
		if(!s[c])
		{
			sb.append(c);
			s[c]=true;
		}
	
	}
	System.out.println(sb.toString());
}
}
