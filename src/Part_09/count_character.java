package Part_09;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class count_character
{
   public static void main(String[] args) 
{
	 String s1="repeate";
	 int[] counter=new int[256];
	 for(int i=0;i<=s1.length()-1;i++)
	 {
		 counter[(int)s1.charAt(i)]++;
	 }
	 for(int i=1;i<256;i++)
	 {
		 if(counter[i]!=0)
		 {
			 System.out.println((char)i+" "+counter[i]);
		 }
	 }
	 
	 
	 SimpleDateFormat sb=new SimpleDateFormat("dd MMMM yyyy");
	 Date db=new Date();
	 Object fd = sb.format(db);
	 System.out.println(fd);
	 
	
}
}
