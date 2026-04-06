package com.subscription.util;

import com.subscription.model.*;

public class SubscriptionFactory {

    public static Subscription createPlan(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }

        switch (type.toLowerCase()) {
            case "basic":
                return new BasicSubscription();
            case "premium":
                return new PremiumSubscription();
            default:
                throw new IllegalArgumentException("Invalid subscription type");
        }
    }
}