package day4;

public class Stringbuffers {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("hello");
		System.out.println(s);
		s.append("Nani");
		System.out.println(s);
		s.insert(9,"I am sai");
		System.out.println(s);
		s.delete(5,13);
		System.out.println(s);
		s.reverse();
		System.out.println(s);	
}
}
