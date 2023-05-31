package queue;
//ARRAY DEQUEUE:
import java.util.ArrayDeque;
import java.util.Iterator;

public class Queuearray {
	public static void main(String[] args) {
		ArrayDeque<Integer> arr=new ArrayDeque<Integer>();
		arr.add(10);
		arr.offer(20);
		arr.offerFirst(5);
		arr.add(30);
		arr.offer(35);
		arr.offer(40);
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
			System.out.println(it.next());     //next means giving output.
		  
		}
		System.out.println("List iterator");
		
		
	}

}
