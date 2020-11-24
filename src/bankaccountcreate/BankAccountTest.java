package bankaccountcreate;



public class BankAccountTest {

	public static void main(String[] args) {
		
	
			BankAccount ramAccount = new BankAccount("Ram");
			ramAccount.depositFund(500);
			ramAccount.withdrawFund(200);
			
			BankAccount shyamAccount = new BankAccount("Shyam", 2000);
			shyamAccount.withdrawFund(200);
			shyamAccount.depositFund(500);
			
			ramAccount.depositFund(700);
			

		}

	}