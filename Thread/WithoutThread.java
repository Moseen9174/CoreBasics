package Thread;

public class WithoutThread {
  String name;
  public WithoutThread(String name) {
	 this.name=name;
}
  public void run() {
	  for (int i = 0; i < 5; i++) {
		System.out.println(i +" "+ name);
	}
  }
}
