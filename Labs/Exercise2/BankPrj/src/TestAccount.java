
public class TestAccount {
	public static void main(String[] args) {
		Account acc =  new Account(100);
		acc.deposit(47);
		acc.withdraw(150);
		
		System.out.println("The final balance of the account is: " + acc.getBalance());
	}
}
