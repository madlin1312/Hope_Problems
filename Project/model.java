package model;

public abstract class User {
    protected String userId;
    protected String name;
    protected String email;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public abstract void displayRole();

    public String getUserId() { return userId; }
    public String getName() { return name; }
}
