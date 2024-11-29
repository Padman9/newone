package javab;

public class Lager_Word_INString
{
   public static void main(String[] args) 
   {
	String s1="My name is Maxword";
	String []word=s1.split(" ");
	String maxlen="";
	for(int i=0;i<=word.length-1;i++)
	{
		for(int j=1+i;j<=word.length-1;j++)
    {
	
		if(word[i].length()>=word[j].length())
		{
			maxlen=word[i];
		}
     }	
	}
	System.out.println(maxlen);
}
}