package state;

public class GoldAccount implements AccountState {

	private final int discount = 3;

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
