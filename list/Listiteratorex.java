package list;
import java.util.LinkedList;
import java.util.ListIterator;
public class Listiteratorex {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.addFirst("nani");
		l.add("actor");
		l.add("hero");
		l.addLast("hyd");
		System.out.println(l);
		ListIterator lt=l.listIterator();
		System.out.println("Forward order");
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		System.out.println("Reverse order");
		
		while(lt.hasPrevious())
		{
			System.out.println(lt.previous());
		}	
	
	}
}
