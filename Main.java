import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Shopping Cart
        ShoppingCart cart = ShoppingCart.getInstance();
        cart.addItem("Notebook");
        cart.addItem("Celular");
        System.out.println("\nItens do carrinho: " + cart.getItems());

        // Payment
        PaymentFactory factory = new PaymentFactory();
        Payment payment = factory.getPaymentMethod("cartão de crédito");
        payment.pay(100);

        // Observer
        Stock stock = new Stock();
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        stock.registerSubscriber(user1);
        stock.registerSubscriber(user2);
        stock.notifySubscribers("Item 1");
        
        ShoppingCartWithDiscount cartWithDiscount = new ShoppingCartWithDiscount(100);

        // Holiday Discount
        DiscountStrategy holidayDiscount = new HolidayDiscount();
        cartWithDiscount.setDiscountStrategy(holidayDiscount);
        System.out.println("\nPreço final com desconto de férias: " + cartWithDiscount.getFinalPrice());

        // Loyalty Discount
        DiscountStrategy loyaltyDiscount = new LoyaltyDiscount();
        cartWithDiscount.setDiscountStrategy(loyaltyDiscount);
        System.out.println("Preço final com desconto de fidelidade: " + cartWithDiscount.getFinalPrice()+"\n");
    }
}