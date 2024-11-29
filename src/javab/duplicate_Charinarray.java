package javab;

public class duplicate_Charinarray 
{
	public static void main(String[] args) 
	{
		String s1 = "india";
		char[] dup = s1.toCharArray();
		for (int i = 0; i <= s1.length() - 1; i++)
		{
			for (int j = i + 1; j <= s1.length() - 1; j++)
			{
				if (dup[i] == dup[j])
				{
					System.out.println(dup[j]);
				}
			}

		}
	}

}

