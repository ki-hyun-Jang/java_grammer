package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private int balance;

    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void updateBalance(int balance){
        this.balance += balance;
    }
}
