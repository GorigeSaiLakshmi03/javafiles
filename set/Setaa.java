package set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Setaa {
	public static void main(String[] args) {
		Set<Integer> se=new HashSet<Integer>();
		se.add(17);
		se.add(69);
		se.add(96);       //print only one element..
		se.add(96);
		System.out.println(se);
		//System.out.println(se.hashCode());
		Iterator<Integer> t=se.iterator();
		while(t.hasNext())
		{	
			System.out.println(t.next());     
		  
		}
		//REMOVE:
		/*System.out.println("remove");
		se.remove(96);
		System.out.println(se);
		se.removeAll(se);
		System.out.println(se);
		if(se.isEmpty()) {
			System.out.println("true");
		}
		else {
			System.err.println("false");
		}*/
		Set<Integer> se1=new HashSet<Integer>();
		se1.add(78);
		se1.add(17);
		se1.add(96);
		se1.add(48);
		System.out.println(se1);
		//INTERSECTOIN OF TWO SETS:
		se.retainAll(se1);
		System.out.println(se);
		//CONTAINS:
		System.out.println("CONTAINS:");
		System.out.println(se1.contains(10));
		//SIZE:
		System.out.println("SIZE:");
		System.out.println(se1.size());
		//CONTAINS ALL
		System.out.println("CONTAINS ALL");
		System.out.println(se.containsAll(se1));
		

		
		
		
			
		
		
		
	}

}
