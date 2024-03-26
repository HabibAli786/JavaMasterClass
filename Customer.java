public class Customer {
    private String name;
    private int creditLimit;
    private String email;

    public Customer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this.name = "no name";
        this.creditLimit = 0;
        this.email = "no email";
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.creditLimit = 0;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
