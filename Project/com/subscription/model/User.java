package com.subscription.model;

public abstract class User {
    private String userId;
    private String name;
    private String email;

    public User(String userId, String name, String email) {
        if (userId == null || name == null || email == null) {
            throw new IllegalArgumentException("User details cannot be null");
        }
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public abstract void displayRole();
}