package javab;

public class Revrse_starement 
{
   public static void main(String[] args)
   {
	   
	String s1="This is my First aTTempt";
	String []ar=s1.split(" ");
	for(int i=ar.length-1;i>=0;i--)
	{
		
			System.out.print(ar[i]+" ");
	}
	
	int len = s1.length();
	StringBuffer sb=new StringBuffer(len);
	for(int i=0;i<=len-1;i++)
	{
		char c=s1.charAt(i);
		
		if(Character.isLowerCase(c))
		{
			c=Character.toUpperCase(c);
		}
		else if(Character.isUpperCase(c))
		{
			c=Character.toLowerCase(c);
		}
		sb.append(c);
	}
		String s2 = sb.toString();
		
	System.out.println();
	System.out.println(s2);
}
}

