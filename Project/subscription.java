package model.subscription;

public abstract class Subscription {
    protected String planName;
    protected double price;

    public Subscription(String planName, double price) {
        this.planName = planName;
        this.price = price;
    }

    public abstract double calculateCost(int months);

    public String getPlanName() { return planName; }
}