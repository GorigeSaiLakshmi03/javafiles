package abstra;

abstract class animals1{
	abstract void sound();
	public void type() {
		System.out.println("Animals");
		
			
		}
	
	}


class cat extends animals1{
	public void sound() {
		System.out.println("i am cat");
		System.out.println("i make sound as Meow Meow...!!!");
	}
}
	class dog extends animals1{
		public void sound() {
			System.out.println("i am dog");
			System.out.println("i make sound as bow bow!!");
		}
	}
	class goat extends animals1{
		public void sound() {
			System.out.println("i am goat");
			System.out.println("i make a sound as mey mey!");
		}
		
	
	
	
	}
public class Abstract {
	public int res() {
		int a=20;
		int b=10;
		
		
	
	int sum=a+b;
	return sum;
	
	
	}
	public static void main(String[] args) {
		cat c=new cat();
		dog d=new dog();
		goat g=new goat();
		c.type();
		c.sound();
		d.sound();
		g.sound();
		Abstract s=new Abstract();
		 int sum1=s.res();
		System.out.println(sum1);
		
		

		
		
	}

}

