package C02ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C0206ClassPractice {
    public static void main(String[] args) {
//        Account 담을 자료구조로 어느게 가장 적합한지 고려 (Map?)
        List<Account> accounts = new ArrayList<>();
        Account a1 = new Account("111111",100000);
        Account a2 = new Account("222222",100000);
        accounts.add(a1);
        accounts.add(a2);
//        계좌번호 목록조회
        for(Account a : accounts){
            System.out.println(a.getAcNumber());
        }
//        사용자1이 사용자2에게 돈을 보내는 상황: 계좌번호를 알고 있는 상황.
        for(Account a : accounts){
            if(a.getAcNumber().equals("111111")) a.setBalance(a.getBalance()-50000);
            if(a.getAcNumber().equals("222222")) a.setBalance(a.getBalance()+50000);
        }

//        계좌번호와 잔고조회
        for(Account a : accounts){
            System.out.println("계좌번호는 "+ a.getAcNumber() + " 잔고는 " + a.getBalance());
        }

//        Map을 자료구조로 사용 시
        Map<String, Account> map = new HashMap<>();
    }
}

class Account{
    private String acNumber;
    private int balance;

    public Account(String acNumber, int balance) {
        this.acNumber = acNumber;
        this.balance = balance;
    }

    public String getAcNumber() {
        return acNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}