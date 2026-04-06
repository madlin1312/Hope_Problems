package com.subscription.model;

public class BasicSubscription extends Subscription {

    public BasicSubscription() {
        super("Basic", 200);
    }

    @Override
    public double calculateCost(int months) {
        return getPricePerMonth() * months;
    }
}