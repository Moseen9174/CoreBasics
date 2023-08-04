package Thread;

public class ThreadPriority extends Thread{

	String name;
	public ThreadPriority(String name) {
		this.name=name;
	}
	
	
     public void run() {
    	 for (int i = 0; i < 15; i++) {
			System.out.println(name + "p=" + getPriority());
		}
	
}
}
