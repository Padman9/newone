package javab;

public class Upper_lower_case 
{
	public static void main(String[] args) {
		
	
String s1="UpA LamnbP";
System.out.println("Original string: "+s1);
int len = s1.length();
StringBuffer sb=new StringBuffer(len);
for(int i=0;i<=len-1;i++)
{
	char c=s1.charAt(i);
	if(Character.isTitleCase(c))
	{
		c=Character.toLowerCase(c);
	}
	else if(Character.isUpperCase(c))
	{
		c=Character.toLowerCase(c);
	}
	else if(Character.isLowerCase(c))
	{
		c=Character.toUpperCase(c);
	}
	
	sb.append(c);
}

String s2 = sb.toString();
System.out.println("converted String: "+s2);

}
}