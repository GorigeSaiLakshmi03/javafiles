package assignment;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Arraydequeex {
	public static void main(String[] args) {
		ArrayDeque<Integer> arr=new ArrayDeque<Integer>();
		arr.add(80);
		arr.offer(2);
		arr.offerFirst(5);
		arr.add(39);
		arr.offer(35);
		arr.offer(4);
		arr.offer(45);
		arr.offerLast(50);
		arr.addFirst(0);
		System.out.println(arr);
		//remove:
		arr.remove();
		System.out.println(arr);
		arr.pop();
		System.out.println(arr);
		System.out.println("Iterator method:");
	
		Iterator it=arr.iterator();
		while(it.hasNext())
		{	
			System.out.println(it.next());    
		  
		}

		
	}

}
