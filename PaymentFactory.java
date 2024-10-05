// Factory class for creating payment objects
class PaymentFactory {
    public Payment getPaymentMethod(String type) {
        if (type.equalsIgnoreCase("cartão de crédito")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("pix")) {
            return new PixPayment();
        }
        return null;
    }
}