package queue;
import java.util.PriorityQueue;
public class Priorityqueue {
	public static void main(String[] args) {
		/*PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.offer(1);
		p.offer(2);
		p.offer(5);
		p.offer(9);
		p.offer(11);
		System.out.println(p);
		//FOR EACH:
		System.out.println("for each method:");
		for(Integer s:p ) {
			System.out.println(s);	
		}
		//PEEK METHOD:
		System.out.println("peek methods:");
		System.out.println(p.peek());
		//CONTAINS:
		System.out.println("Contains method:");
		p.contains(3);
		System.out.println(p.contains(3));
		p.contains(2);
		System.out.println(p.contains(2));*/
		
		PriorityQueue<String> s1=new PriorityQueue<String>();
		s1.add("bat");
		s1.add("doll");
		s1.add("abcd");
		System.out.println(s1);
		System.out.println(s1.poll());
		System.out.println(s1.poll());
		System.out.println(s1.poll());
		s1.poll();
		s1.poll();
		s1.poll();
		System.out.println(s1);
		/*while(!(s1.isEmpty())) {
			System.out.println(s1.poll());   //poll means checking the priority.
		}*/
		
		
		
		
		
		
	}

}
