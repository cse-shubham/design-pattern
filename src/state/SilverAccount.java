package state;

public class SilverAccount implements AccountState {

	private final int discount = 1;

	@Override
	public int giveDiscount() {
		// TODO Auto-generated method stub
		return discount;
	}
}
