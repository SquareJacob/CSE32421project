public class Customer {
    String name;
    String userId;

    Customer(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    // get info
    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", userId=" + userId + "]";
    }
}
