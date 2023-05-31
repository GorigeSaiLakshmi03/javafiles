package list;
//import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> len=new LinkedList<String> ();
		len.add("sai");
	
		len.add("ece");
		len.add("cbit");
		System.out.println(len);
		LinkedList l2=new LinkedList();
		l2.addAll(len);
		System.out.println(l2);
		//CLEAR
		l2.clear();
		System.out.println(l2);
		//REMOVE:
		len.remove(1);
		System.out.println(len);
		System.out.println("after adding to first position");
		len.addFirst("lakshmi");
		System.out.println(len);
		//SIZE:
		len.size();
		System.out.println(len.size());
		//SET:
	    len.set(0, "cbit");
	    System.out.println(len);
	    //INDEXOF:
	    System.out.println("after index method:");
	    System.out.println(len.indexOf("sai"));
		/*Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the string name");
		len.add(sc.nextLine());
		System.out.println("enter the string name");
		len.add(sc.nextLine());
		System.out.println("enter the String name");
		len.add(sc.nextLine());
		System.out.println(len);*/
		
		//for each:--->                                                                         the output is displayed in vertical form(i.e.,one by one)
	    
		for(String s:len) {
			System.out.println(s);          
		}
		//ITERATION:means REPEATE...
		System.out.println("Iteration method");
		Iterator it=len.iterator();
		while(it.hasNext())
		{
		  //System.out.println(it.next());	                                                   //next means giving output.
		  if(it.next().equals("cbit"))
		  {
			  it.remove();
		  }
		}
		System.out.println(len);
			
	}

}
