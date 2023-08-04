package Thread;

public class DemonThread extends Thread {
 public void run() {
	 if(Thread.currentThread().isDaemon()) {
		 System.out.println("is deamon");
	 }
	 else {
		 System.out.println("child");
	 }
	 System.out.println("Demon thread");
 }
}
