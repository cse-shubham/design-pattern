package state;

public class Account {

	private int amount;
	private String name;

	public Account(int amount, String name) {
		this.amount = amount;
		this.name = name;
	}

	public void addAmount(int amount) {
		this.amount += amount;
	}

	public void debitAmount(int amount) {
		if (this.amount <= amount)
			throw new RuntimeException("Invalid Transaction");

		this.amount -= amount;
	}

	public int getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public int getApplicableDiscount() {
		return AccountStateEnum.getType(this).giveDiscount();
	}

}
