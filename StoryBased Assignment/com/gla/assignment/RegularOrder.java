package com.gla.assignment;

public class RegularOrder extends Order {

    public RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    public double calculateBill() {
        // Regular order has no discount
        return super.calculateBill();
    }
}
