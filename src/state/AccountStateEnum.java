package state;

public enum AccountStateEnum {

	GOLD(1000), PREMIUM(5000), SILVER(0);

	private int balance;

	private AccountStateEnum(int balace) {
		this.balance = balace;
	}

	public static AccountState getType(Account account) {
		if (account.getAmount() > PREMIUM.balance)
			return new PremiumAccount();
		else if (account.getAmount() > GOLD.balance)
			return new GoldAccount();

		return new SilverAccount();
	}

}
