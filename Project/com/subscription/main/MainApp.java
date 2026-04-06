package com.subscription.main;

import com.subscription.model.*;
import com.subscription.services.SubscriptionService;
import com.subscription.util.SubscriptionFactory;

public class MainApp {

    public static void main(String[] args) {

        try {
            Customer user = new Customer("U101", "Arun", "arun@gmail.com");
            user.displayRole();

            SubscriptionService service = new SubscriptionService();

            Subscription basic = SubscriptionFactory.createPlan("basic");
            Subscription premium = SubscriptionFactory.createPlan("premium");

            // Test Case 1
            service.subscribe(user, basic, 3);

            // Test Case 2 (Upgrade Feature)
            Subscription upgraded = service.upgradePlan(basic);
            service.subscribe(user, upgraded, 6);

            // Test Case 3 (Error Handling)
            service.subscribe(user, premium, -2);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}