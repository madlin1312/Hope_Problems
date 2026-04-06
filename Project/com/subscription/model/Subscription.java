package com.subscription.model;

public abstract class Subscription {
    private String planName;
    private double pricePerMonth;

    public Subscription(String planName, double pricePerMonth) {
        this.planName = planName;
        this.pricePerMonth = pricePerMonth;
    }

    public String getPlanName() { return planName; }
    public double getPricePerMonth() { return pricePerMonth; }

    public abstract double calculateCost(int months);
}