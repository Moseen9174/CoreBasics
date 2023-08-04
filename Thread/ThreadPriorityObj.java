package Thread;

public class ThreadPriorityObj {

	public static void main(String[] args) {
		
		ThreadPriority t1=new ThreadPriority("Moseen");
		ThreadPriority t2=new ThreadPriority("Rahul");
		ThreadPriority t3=new ThreadPriority("Raj");
		
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
