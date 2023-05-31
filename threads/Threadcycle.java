package threads;

class worker extends Thread{
	public void run() {
		Thread.currentThread().setName("run_method");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName()+": run method is alive check: "+isAlive);
				System.out.println("worker thread is done.");
				Thread.sleep(5000);
	}
}                         
public class Threadcycle extends Thread{
	public static void main(String[] args) {
		worker workerThread=new worker();
		workerThread.start();
		System.out.println("main thread continues executing.");
		try {
			workerThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(workerThread.getname()+": run method is alive");
		System.out.println("main method alive: "+Thread.currentThread().);
	}

}
