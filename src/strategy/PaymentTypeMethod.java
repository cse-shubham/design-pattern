package strategy;

public class PaymentTypeMethod {

	public static PaymentStrategy payment(String paymentType) {
		switch (paymentType) {
		case "GIFT_CARD":
			return new GiftCardPayment();
		case "CREDIT_CARD":
			return new CreditCardPayment();
		}
		throw new RuntimeException("Invalid payment type");
	}

}
