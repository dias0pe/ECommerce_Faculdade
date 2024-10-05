// Payment interface
interface Payment {
    void pay(double amount);
}

// Concrete implementations of payment methods
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Pagou $" + amount + " com cartão de crédito.\n");
    }
}

class PixPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Pagou $" + amount + " com PIX.\n");
    }
}