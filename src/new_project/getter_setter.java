package new_project;

public class getter_setter 
{
	private	int rollnum;     //declare the private data to protect from public access
	 private String s1;
	 
	 public int getrollnum()
	    {
		 return this.rollnum;       // to access or get these private value or protected value 
	    }                                  //we can use getter and setter to acess and update or manipulate
	 public void setrollnum(int rollnum)
	    {
		 this.rollnum=rollnum;
	    }
	 public String gets1() 
	 
	 
	   {
		 return this.s1;
	   }
	 public void sets1(String s1)
	   {
		 this.s1=s1;
	   }
  public void m1()
  
 	{
	  
 		System.out.println(this.rollnum);
 		System.out.println(this.s1);
 	}
 	
}