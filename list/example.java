package list;

import java.util.Iterator;
import java.util.LinkedList;

public class example {
	public static void main(String[] args) {
		LinkedList<String> len=new LinkedList<String> ();
		len.add("sai");
		len.add("ece");
		len.add("cbit");
		System.out.println(len);
		System.out.println("Iteration method");
		Iterator it=len.iterator();
		while(it.hasNext())
		{
		    //System.out.println(it.next());	                                                   //next means giving output.
	     
		  if(it.next()=="cbit")
		  {
			  it.remove();
		  }
			 
		  
		}
		System.out.println(len);
			
	}


	

}
