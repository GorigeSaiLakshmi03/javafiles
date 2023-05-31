package day8;

public class Staticblock {
	public static void main(String[] args) {
		System.out.println("Hi.. I am main method");
	}
	static {          //FIRST excute the STATIC method.after that excute the MAIN Method.
		System.out.println("Hii....I am static method");
	}

}
