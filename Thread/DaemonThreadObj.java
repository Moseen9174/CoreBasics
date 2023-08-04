package Thread;

public class DaemonThreadObj {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread");
		
		DemonThread d1=new DemonThread();
		d1.setDaemon(true);
		d1.start();
	}}
