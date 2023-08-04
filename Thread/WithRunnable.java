package Thread;

public class WithRunnable implements Runnable {

	String name;
  
    public WithRunnable(String name) {
		this.name=name;	
	}  
    
   
	@Override
	public void run() {
		for (int i = 0; i <=15; i++) {
			System.out.println(i + name);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
  
}
