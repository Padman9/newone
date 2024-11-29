package new_project;

public class three implements first,second
{

	public void p1()
	{
		System.out.println("complte p1 method");
	}
	public void p2()
	{
		System.out.println("complete p2 method");
	}
	public void p3()
	{
		System.out.println("complte p3 method");
	}
	public void p4()
	{
		System.out.println("complte p4 method");
	}
	public static void main(String[] args) 
	{
		three s=new three();
		s.p1();
		s.p2();
		s.p3();
		s.p4();
	}
}
