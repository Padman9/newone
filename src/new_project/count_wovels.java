package new_project;

public class count_wovels 
{
	public static void main(String[] args) 
	{
		String s1="welcome";
		int count =0;
		char ch;
		for(int i=0;i<s1.length();i++)
		{
			 ch =s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		
		
		}
		System.out.println("number of vowels "+count);
		
		
		
		
		
		
	   }
	}


