package strategy;

public class GiftCardPayment implements PaymentStrategy {
    String creditCardNumber;
    String expiryDate;
    String cvv;
    
	@Override
	public boolean pay(Long amount) {
		initiatePayment();
        return makePayment(amount);
	}

	public void initiatePayment() {
	    // ask for creditCard
		System.out.println("Entering card number");
		// ask for expiry
		System.out.println("Entering card expiry");
		// ask for cvv
		System.out.println("Entering card cvv");
	}
	
	public boolean makePayment(Long amount) {
		// api calls send card data to API
		System.out.println("Making payment for amount " + amount);
		return true;
	}
}
