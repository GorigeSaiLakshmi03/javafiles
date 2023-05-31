package set;
import java.util.*;
import java.util.Iterator;
public class Hashmapp {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1,"sai");
		m.put(4,"hi");
		m.put(3, "hello");
		m.put(6,"jaanu");
		m.put(2,"nani");
		m.put(5,"baby");
		System.out.println(m);
		
		Set s=m.entrySet();
		//ITERATOR:
	Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

		
	}

}
