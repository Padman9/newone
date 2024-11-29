package javab;

public class Star_pattern_without_space 
{
   public static void main(String[] args)
   {
	
	   int star=1;
	   for(int i=0;i<9;i++)
	   {
		   for(int j=0;j<star;j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		  // star++;
		   if(i<4)
		   {
			   star++;
		   }
		   else
		   {
			   star--;
		   }
	   }
}
}
