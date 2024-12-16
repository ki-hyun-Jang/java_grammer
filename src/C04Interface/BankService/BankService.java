package C04Interface.BankService;

public interface BankService {
    void deposit(int money, BankAccount ba);
    void withdraw(int money, BankAccount ba);
}
