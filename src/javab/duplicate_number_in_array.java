package javab;

public class duplicate_number_in_array
{
  public static void main(String[] args) 
  {
	int []ar= {1,5,6,8,7,3,4,1,9,5,7};
	for(int i=0;i<=ar.length-1;i++)
	   {
		for(int j=i+1;j<=ar.length-1;j++)
			if(ar[i]==ar[j])
			{
		
			System.out.println(ar[j]);
		   }
		
		}
	}
}

