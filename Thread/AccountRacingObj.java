package Thread;

public class AccountRacingObj {

	public static void main(String[] args) {
		
		AccountRacing2 r1=new AccountRacing2("Moseen");
		AccountRacing2 r2=new AccountRacing2("Rahul");
		r1.start();
		r2.start();
		
	}
}
