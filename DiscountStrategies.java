// Strategy interface
interface DiscountStrategy {
    double applyDiscount(double price);
}

// Concrete discount strategies
class HolidayDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.90;  // 10% off
    }
}

class LoyaltyDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.85;  // 15% off
    }
}

// Context class for applying discounts
class ShoppingCartWithDiscount {
    private DiscountStrategy discountStrategy;
    private double totalPrice;

    public ShoppingCartWithDiscount(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getFinalPrice() {
        return discountStrategy.applyDiscount(totalPrice);
    }
}