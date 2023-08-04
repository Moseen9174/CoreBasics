package Thread;

public class WithoutThreadObj {

	public static void main(String[] args) {
		WithoutThread w1=new WithoutThread("Rahul");
		WithoutThread w2=new WithoutThread("Moseen");
		w1.run();
		w2.run();
	}
}
