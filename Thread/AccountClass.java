package Thread;

public class AccountClass {

	private int Balance=0;
	
	public synchronized void deposite(String msg , int amt) {
	int bal =	getBalance() + amt;
	System.out.println(msg +"new balance"+ bal);
		
	}
	
	public int getBalance() {
		return Balance;
	}
	
	public void setBalance(int balance) {
		Balance = balance;
	}
}
