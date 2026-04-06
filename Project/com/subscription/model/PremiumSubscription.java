package com.subscription.model;

public class PremiumSubscription extends Subscription {

    public PremiumSubscription() {
        super("Premium", 500);
    }

    @Override
    public double calculateCost(int months) {
        return getPricePerMonth() * months * 0.9;
    }
}