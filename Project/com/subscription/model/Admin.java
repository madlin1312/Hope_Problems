package com.subscription.model;

public class Admin extends User {

    public Admin(String userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Admin");
    }
}