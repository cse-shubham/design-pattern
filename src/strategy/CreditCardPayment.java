package strategy;

public class CreditCardPayment implements PaymentStrategy {
	String giftCardNumber;

	@Override
	public boolean pay(Long amount) {
		System.out.println("Entering gc number");
		return makePayment(amount);
	}

	public boolean makePayment(Long amount) {
		// api calls send card data to API
		try {
			System.out.println("Intiating gift card payment");
			Thread.sleep(1000);
			System.out.println("Gift card payment for amount " + amount);
			return true;
		} catch (InterruptedException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getLocalizedMessage());
		}
	}
}
