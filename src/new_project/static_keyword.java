package new_project;

public class static_keyword 
{
	int a=10;
	static int b=20;
	void m2()
	{
		System.out.println("non static method");
		System.out.println(a);
		System.out.println(b);
	}
	
	static void m1()
	{
		System.out.println("static method");
		System.out.println(b);
		
	}
   public static void main(String[] args) 
   {
	 static_keyword.m1();
	 static_keyword st= new static_keyword();
	 st.m2();
	 
}
}
