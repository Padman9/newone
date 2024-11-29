package Part_09;

public class number_p02 
{
   public static void main(String[] args)
   {
	int count,c=0;
	for(int i=0;i<=100;i++)
	{
		count=0;
		for(int j=2;j<i/2;j++)
		{
			if(i%j==0)
			{
				count=1;
			}
		}
		if(count==0)
		{
			c++;
			System.out.print(i+" ");
			
			
		}
		
	}
	System.out.println();
	System.out.println("Total number of count "+c);
	System.out.println();
	System.out.println("-----------------remove zero from number---------------");
	String s1="00000154660";
	int i=0;
	while(i<=s1.length()&&s1.charAt(i)=='0')
		i++;
	StringBuffer sb=new StringBuffer(s1);
	sb.replace(0, i, "");
	s1=sb.toString();
	System.out.println(s1);
	System.out.println();
	System.out.println("----------------------duplicate number in array-------------");
	int []ar= {1,5,6,3,5,7,4,7,8,9,1};
	for(int d=0;d<ar.length-1;d++)
	{
		for(int n=d+1;n<ar.length;n++)
		{
			if(ar[d]==ar[n])
			{
				System.out.print(ar[n]+" ");
			}
		}
	}
	
}
}
