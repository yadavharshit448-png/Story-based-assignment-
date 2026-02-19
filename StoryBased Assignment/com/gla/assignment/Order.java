package com.gla.assignment;

public class Order {
    protected int orderId;
    protected double baseAmount;
    public static double deliveryCharge = 40.0;

    public Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    public double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}
