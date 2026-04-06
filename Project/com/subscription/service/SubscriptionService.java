package com.subscription.services;

import com.subscription.model.*;

public class SubscriptionService {

    public void subscribe(User user, Subscription plan, int months) {

        if (user == null || plan == null) {
            System.out.println("Error: Invalid user or plan");
            return;
        }

        if (months <= 0) {
            System.out.println("Error: Duration must be greater than 0");
            return;
        }

        double cost = plan.calculateCost(months);

        System.out.println("\n===== SUBSCRIPTION DETAILS =====");
        System.out.println("User: " + user.getName());
        System.out.println("Plan: " + plan.getPlanName());
        System.out.println("Duration: " + months + " months");
        System.out.println("Total Cost: Rs." + cost);
        System.out.println("================================\n");
    }

    // Extra Feature: Upgrade Plan
    public Subscription upgradePlan(Subscription currentPlan) {
        if (currentPlan instanceof BasicSubscription) {
            System.out.println("Upgrading from Basic to Premium...");
            return new PremiumSubscription();
        } else {
            System.out.println("Already on highest plan");
            return currentPlan;
        }
    }
}