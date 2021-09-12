package strategy;

public class Driver {

	public static void main(String[] args) {
		// TODO:: there is shopping cart, having item details and payment strategy
		// selected

		PaymentStrategy strategy = PaymentTypeMethod.payment("GIFT_CARD");
		strategy.pay(1000L);

		PaymentStrategy strategy2 = PaymentTypeMethod.payment("CREDIT_CARD");
		strategy2.pay(1000L);
	}
}
