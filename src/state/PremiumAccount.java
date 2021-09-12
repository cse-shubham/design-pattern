package state;

public class PremiumAccount implements AccountState {

	private final int discount = 5;

	@Override
	public int giveDiscount() {
		// TODO Auto-generated method stub
		return discount * hasAnyApplicableFestiveOffer();
	}

	private int hasAnyApplicableFestiveOffer() {
		// TODO Auto-generated method stub
		return 1;
	}

}
