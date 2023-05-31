package day6;
class father{
	String name="nani";
	public void pri() {
		System.out.println("SAI");
	}
}
class son extends father{
	int age=10;	
	public void pri1() {
		System.out.println("my age is "+15);
	}
}
class daughter extends father{
	int age1=20;
	public void pri2() {
		System.out.println("my age is "+1);
	}
	}

public class Hierachical {
	public static void main(String[] args) {
		son s=new son ();
		daughter d=new daughter();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(d.age1);
		System.out.println(d.name);
		s.pri();
		s.pri1();
		d.pri2();
		d.pri();
		
		
	}
	

}
