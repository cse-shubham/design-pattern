package state;

public class Driver {

	public static void main(String[] args) {
		Account account = new Account(100, "shubham");
		System.out.println(account.getAmount() + " discount = " + account.getApplicableDiscount());

		account.addAmount(5000);
		System.out.println(account.getAmount() + " discount = " + account.getApplicableDiscount());

		account.debitAmount(3000);
		System.out.println(account.getAmount() + " discount = " + account.getApplicableDiscount());

	}

}
