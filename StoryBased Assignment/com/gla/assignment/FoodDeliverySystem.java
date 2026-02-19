package com.gla.assignment;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        System.out.println("Online Food Delivery App System");
        System.out.println("--------------------------------");

        // Create Regular Order
        Order regular = new RegularOrder(101, 500.0);
        System.out.println("Regular Order (ID: 101, Amount: 500.0)");
        System.out.println("Delivery Charge: " + Order.deliveryCharge); // Accessing static variable
        System.out.println("Total Bill: " + regular.calculateBill());
        System.out.println();

        // Create Premium Order
        Order premium = new PremiumOrder(102, 1000.0);
        System.out.println("Premium Order (ID: 102, Amount: 1000.0)");
        System.out.println("Delivery Charge: " + Order.deliveryCharge);
        System.out.println("Total Bill: " + premium.calculateBill());
        System.out.println();

        // Demonstrate Polymorphism
        System.out.println("Demonstrating Polymorphism:");
        Order[] orders = {
            new RegularOrder(103, 200.0),
            new PremiumOrder(104, 200.0)
        };

        for (Order order : orders) {
            String type = (order instanceof PremiumOrder) ? "Premium" : "Regular";
            System.out.println(type + " Order (ID: " + order.orderId + ") Bill: " + order.calculateBill());
        }
    }
}
