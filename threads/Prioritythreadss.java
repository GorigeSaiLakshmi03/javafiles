package threads;

public class Prioritythreadss extends Thread{
	public void run()
	{
		System.out.println("RUN METHOD "+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
	    System.out.println();
	    Thread.currentThread().setName("run");
	    System.out.println(Thread.currentThread().getName());
	    Thread.currentThread().setPriority(10);
	    System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Prioritythreadss pt=new Prioritythreadss ();
		pt.start();
		System.out.println("MAIN METHOD "+Thread.currentThread().getPriority());
		System.out.println();
	    Thread.currentThread().setName("main");
	    System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(4);
		System.out.println(Thread.currentThread().getPriority());
		
		
	}

}
