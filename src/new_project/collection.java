package new_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class collection
{
  public static void main(String[] args) 
  {
	  ArrayList ls=new ArrayList();
	  ls.add(100);
	  ls.add(null);
	  ls.add(null);
	  ls.add(200);
	  ls.add(200);
	  System.out.println(ls);
	   
	  
	  LinkedHashSet hs=new LinkedHashSet();
	//  hs.add(null);

	  hs.add(200);
	  hs.add(200);
	  hs.add(100);
	  hs.add(300);
	  
	  System.out.println(hs);
	  Iterator itr = hs.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  System.out.println();
	  TreeSet ts=new TreeSet(hs);
	  System.out.println(ts);
	  
}
}
