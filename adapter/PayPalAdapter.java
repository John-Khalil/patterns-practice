package adapter;

public class PayPalAdapter implements PaymentProcessor {
  private final PayPal payPal;
  public PayPalAdapter(PayPal payPal){
    this.payPal=payPal;
  }

  @Override
  public void pay(double amount){
    payPal.makePayment(amount);
  }
}
