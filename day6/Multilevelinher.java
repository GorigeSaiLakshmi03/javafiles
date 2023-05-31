package day6;
 class inher{
	 int age=20;
	 //create a method
	 public void pri1() {
		 System.out.println("Nani");
	 }
	 
 }
 class multi extends inher{
	 String name="sai";
	 public void show() {
		 System.out.println("Age is 30");
	 }
 }
 



public class Multilevelinher extends multi{
	public static void main(String[] args) {
	Multilevelinher s=new Multilevelinher();
	System.out.println(s.age);
	System.out.println(s.name);
	s.pri1();
	s.show();
	System.out.println("My name is "+s.name+" My age is "+s.age); 
	

}
}
