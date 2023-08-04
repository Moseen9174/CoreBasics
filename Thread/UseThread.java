package Thread;

public class UseThread extends Thread {

	  String name;
	  public UseThread(String name) {
		 this.name=name;
	}
	  public void run() {
		  for (int i = 0; i < 5; i++) {
			  System.out.println(isAlive());
			  System.out.println("thread name is" + getName());
			System.out.println(i +" "+ name);
			try {
				sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	  }
}
