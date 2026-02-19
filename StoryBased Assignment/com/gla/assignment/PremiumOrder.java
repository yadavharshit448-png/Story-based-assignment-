package com.gla.assignment;

public class PremiumOrder extends Order {

    public PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    public double calculateBill() {
        // Premium order has 20% discount on base amount
        double discountedAmount = baseAmount * 0.80; // 20% discount
        return discountedAmount + deliveryCharge;
    }
}
