package Part_09;

public class String_number_differ 
{

	public static void main(String[] args) 
	{
		String s="ro12hi3t";
		String num="";
		String sum = "";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				num=num+ch;
			}
			else
			{
				sum=sum+ch;
			}
		}
		System.out.println("charcter is--> "+num);
		System.out.println("string is--> "+sum);
		
	}
}
