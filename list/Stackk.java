package list;

import java.util.Stack;
public class Stackk {
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		st.pop();
		System.out.println(st);
	
		System.out.println(st.empty());
		System.out.println(st.peek());
		st.contains(10);
		System.out.println(st.contains(10));
		//last indexof:
		System.out.println(st.lastIndexOf(30));
		//search:
		System.out.println(st.search(10));
		
		
		
		
		
		
	}

}
