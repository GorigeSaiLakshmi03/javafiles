package day6;


 class parent{               //do not given access specifires.
	 int age=19;
	 //create a method:
	 public void pri() {
		 System.out.println("Hello!");
	 }

 }
 //another class.......    creating multiple classes:
public class Inheritance extends parent{
	public static void main(String[] args) {
		Inheritance re=new Inheritance();
		re.pri();
		System.out.println(re.age);
	}

}
