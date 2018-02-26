package models;

public class UserBuilder {
    public static User registeredUser() {
        User user = new User("flow321","Testpassword1!");
        return user;
    }

    public static User userWithTransactions() {
        User user = new User("transactions4","Mobile1234!");
        return user;
    }
}
