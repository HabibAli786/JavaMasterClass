public class BankAccount {
    private int accNumber = 0;
    private int accBalance = 0;
    private String customerName = "";
    private String customerEmail = "";
    private String customerPhoneNumber = "";

    public BankAccount() {
        this(123, 3000, "Bob", "bob@bob.com", "0743");
    }

    public BankAccount(int accNumber, int accBalance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(30303, 4000, customerName, customerEmail, customerPhoneNumber);
    }

    public int getAccNumber () {
        return accNumber;
    }

    public int getAccBalance() {
        return accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositCash(int cash) {
        this.accBalance += cash;
    }

    public void withdrawCash (int amount) {
        int originalBalance = this.accBalance;
        this.accBalance -= amount;

        if (this.accBalance < 0) {
            this.accBalance = originalBalance;
        }
    }
}
