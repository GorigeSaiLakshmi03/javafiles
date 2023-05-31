package day5;

public class Constructorme {
	private String name;
	private int age;

	//constructor
	public Constructorme(int a,String b) {
		age=a;
		name=b;
	}
	//ANOTHR METHOD FOR GETTING DATA:
	public int getage() {
		return age;
	}
	public String nam() {
		return name;
		
	}
	
	//MAIN METHOD
	public static void main(String[] args) {
		Constructorme con=new Constructorme(23,"Nani");
		Constructorme con1=new Constructorme(19,"Sai");
		int ag=con.getage();     //here age in the form of integer..
		String name=con.nam();
		System.out.println(name);
		System.out.println(ag);
	    System.out.println("My name is "+con.name+" and age is "+con.age);
	}
	
	
}
