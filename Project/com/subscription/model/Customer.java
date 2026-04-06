package com.subscription.model;

public class Customer extends User {

    public Customer(String userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Customer");
    }
}