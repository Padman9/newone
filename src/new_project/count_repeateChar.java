package new_project;

public class count_repeateChar 
{
  public static void main(String[] args) 
  {
	 String s="java programming is very easy java bsaics";
	 
	 int originallen=s.length();
	 
	 int removea=s.replace("a","").length();
	 
	  int occurance=removea-originallen;
	  System.out.println("number of occurance: "+occurance);
	  
	  
	int[]a= {1,2,3,5,8,9,8,45,62,34,74,49};
	int max=0;
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
		
	}
	System.out.println(max);
	
}
}
