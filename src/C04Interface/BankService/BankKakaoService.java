package C04Interface.BankService;

public class BankKakaoService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        ba.updateBalance(money);
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        ba.updateBalance(-money);
    }
}
