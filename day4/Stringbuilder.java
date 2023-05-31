package day4;

public class Stringbuilder {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder ("hello");
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
