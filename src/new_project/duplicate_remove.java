package new_project;


class RemoveDuplicatesExample2    
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
					count++;
					
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}  
    }    