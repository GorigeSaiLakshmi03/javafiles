package day8;
import java.util.Scanner;
interface add{
	void a();
	void b();

	
}
interface sub{
	void c();
	void d();
}
class info implements add,sub{

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("enter the c value:");
		
		
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("enter the d value:");
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("enter the a value:");
		
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("enter the b value:");
		
	
		
	}
	
	
	
	
}

public class Interex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		add s=new info();
		
		
		
		sub u=new info();
		
		
		
		
	}
	

}
