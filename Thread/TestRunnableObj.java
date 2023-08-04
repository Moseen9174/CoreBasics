package Thread;

public class TestRunnableObj {
public static void main(String[] args) {
	WithRunnable r1=new WithRunnable("Jay");
	WithRunnable r2=new WithRunnable("Jaydeep");
	
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	
	t1.start();
	t2.start();
	
	for (int i = 0; i < 55; i++) {
		System.out.println("Main is Running");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
}









