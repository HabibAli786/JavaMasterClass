public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount habibsAccount = new BankAccount(388383, 4000, "Habib", "habibi@habib.com", "07585098676");
        BankAccount defaultAcc = new BankAccount();

//        bank.setAccNumber(1388383828);
//        bank.setAccBalance(2000);
//        bank.setCustomerName("Habib Ali");
//        bank.setCustomerEmail("habib@gmail.com");
//        bank.setCustomerPhoneNumber("075850985676");

        System.out.println("Default Account Number " + defaultAcc.getAccNumber());
        System.out.println("Default Account Balance " + defaultAcc.getAccBalance());
        System.out.println("Default Account Name " + defaultAcc.getCustomerName());
        System.out.println("Default Account Email " + defaultAcc.getCustomerEmail());
        System.out.println("Default Account Phone Number " + defaultAcc.getCustomerPhoneNumber());

        System.out.println("Account Number " + habibsAccount.getAccNumber());
        System.out.println("Account Balance " + habibsAccount.getAccBalance());
        System.out.println("Account Name " + habibsAccount.getCustomerName());
        System.out.println("Account Email " + habibsAccount.getCustomerEmail());
        System.out.println("Account Phone Number " + habibsAccount.getCustomerPhoneNumber());

        habibsAccount.depositCash(3000);
        System.out.println("Deposit 3000 ");
        System.out.println("Account Balance " + habibsAccount.getAccBalance());

        System.out.println("Withdraw 6000 ");
        System.out.println("Account Balance " + habibsAccount.getAccBalance());

    }
}
