package task7designpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorpattern 
{
	public static void main(String args[])
	{
       ArrayList<String> l1 =new ArrayList<String>();
       l1.add("Bhumika");
       l1.add("Akansha");
       l1.add("Purva");
       l1.add("Utkarsha");
       l1.add("Sara");
       Iterator iter=l1.iterator();
       while(iter.hasNext())
       {
    	   String name=(String) iter.next();
    	   System.out.println(iter.hashCode());
    	   System.out.println(iter.getClass());
    	   System.out.println(name);
       }
	} 
}
