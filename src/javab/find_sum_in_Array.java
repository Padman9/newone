
package javab;

public class find_sum_in_Array 
{
  public static void main(String[] args)
  {
	int []ar= {12,1,7,5,8,6,4,9,3,2};
	int num=9;
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)     
		{
			if(num==ar[i]+ar[j])
			{
				System.out.println("("+ar[i]+", "+ar[j]+")");
			}
		}
	}
}
}
