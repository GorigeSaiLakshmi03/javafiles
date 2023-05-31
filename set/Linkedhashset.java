package set;

import java.util.LinkedHashSet;
public class Linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(7);
		ls.add(76);
		ls.add(33);
		ls.add(34);
		ls.add(94);
		ls.add(103);
		System.out.println(ls);

		LinkedHashSet<Integer> ls2=new LinkedHashSet<Integer>();
		ls2.addAll(ls);
		System.out.println(ls2);
		//CONTAINS:
		System.out.println();
		
		
		
		
		
		
		//remove
		System.out.println("Remove");
		ls.remove(33);
		System.out.println(ls);
		
		
		
	}

}
