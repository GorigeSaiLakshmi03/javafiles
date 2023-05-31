package day6;

public class Consover {
	private int age;
	private String name;
	private String address;
	private int phoneno;
	public Consover(int age,String name,String address,int phoneno) {
	this.age=age;                  //"this" is a key word......
	this.name=name;
	this.address=address;
	this.phoneno=phoneno;
	}
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	public String getad() {
		return address;
	}
	public int getpho() {
		return phoneno;
	}
	public static void main(String[] args) {
		Consover o=new Consover(19,"lakshmi","proddatur",12345);
		System.out.println("my name is "+o.name);
		System.out.println("my age is "+o.age);
		System.out.println("I am from "+o.address);
		System.out.println("my phone number is "+o.phoneno);
	}
	
	
	
	
	

}
