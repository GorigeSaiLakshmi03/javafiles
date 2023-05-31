package threads;
import java.util.Scanner;
class assign extends Thread{
	public void run() {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the which assignment to do the assignment");
		int a=sc.nextInt();
		System.out.println("started assignment");
		System.out.println("students completed the assignment");
	}
}
class print extends Thread{
	public void run() {
		System.out.println("start printing:");
		for(int i=0;i<4;i++)
		{
			System.out.println("SAI LAKSHMI");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("printing ended");
	}
}
class oper extends Thread{
	public void run() {
		System.out.println("Addition");
		int b=6;
		int c=78;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int d=b+c;
		System.out.println(d);
		System.out.println("addition ended");
	}
}
public class Nondependent {
	public static void main(String[] args) {
		assign as=new assign();
		print p=new print();
		oper o=new oper();
		as.start();
		p.start();
		o.start();
	}

}
