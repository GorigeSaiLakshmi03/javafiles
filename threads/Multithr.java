package threads;

import java.security.DomainCombiner;

public class Multithr extends Thread{
	/*public void run() {
		System.out.println("run method");
	}
	public static void main(String[] args) {
		Multithr mu=new Multithr();
		mu.start();
		//mu.run();
//if we give RUN it will print run method firstly.
		System.out.println("main method");*/
	
	//BY using FOR loop:
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"run");
		}
	}
	public static void main(String[] args) {
		Multithr m=new Multithr();
		m.start();
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"main");
		}		
	}
}
