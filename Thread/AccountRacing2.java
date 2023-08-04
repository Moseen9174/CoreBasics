package Thread;

public class AccountRacing2 extends Thread {
	
	public static AccountClass data=new AccountClass();
	
	public AccountRacing2(String name) {
		super(name);
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			data.deposite(getName(), 1000);
		}
	}

}
