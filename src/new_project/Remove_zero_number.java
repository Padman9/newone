package new_project;

public class Remove_zero_number
{
 public static void main(String[] args) 
 {
	String s1="00000468532";
	int[]a= {1,3,6};
	try 
	{
		System.out.println(s1.charAt(13));
		try
		{
	         	a[5]=10;
		}
	
	     catch(ArrayIndexOutOfBoundsException  e1)
	    {
		System.out.println("ArrayIndexoutofBoundsException handle");
	
	    }
	}
	catch(StringIndexOutOfBoundsException e2)
	{
		System.out.println("StringIndexOutOfBoundsException handle");
	}
	catch (Exception e)
	{
		System.out.println("generic exception ");
		e.printStackTrace();
	}
	
	}
 
}
