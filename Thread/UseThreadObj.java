package Thread;

public class UseThreadObj extends Thread {

	public static void main(String[] args) {
		UseThread t1=new UseThread("Rahul");
		UseThread t2=new UseThread("Moseen");
		t1.start();
		t1.setName("Raj");
		t2.start();
		try {
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
