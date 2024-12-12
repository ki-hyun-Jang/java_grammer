package C02ClassBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BankService {
    Map<String,Account> accounts = new HashMap<>();
    private boolean bool = true;
    static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        BankService bankService = new BankService();
        while(bankService.bool){
            System.out.println("서비스 번호를 입력해주세요.");
            System.out.println("1.개설 2.조회 3.입금 4.출금 5.송금 6.종료");
            int serviceNum = Integer.parseInt(br.readLine());
            switch (serviceNum){
                case 1: bankService.accountOpening(); break;
                case 2: bankService.checkBalance(); break;
                case 3: bankService.deposit(); break;
                case 4: bankService.withdrawal(); break;
                case 5: bankService.transfer(); break;
                case 6: bankService.bool = false;
                default: System.out.println("잘못 입력했습니다.");
            }
        }
    }

//    서비스 1번 개설
    void accountOpening() throws IOException {
        System.out.println("1. 개설 서비스입니다.");
        System.out.println("사용하실 계좌 번호 6자리를 입력해주세요.");
        String acNum = br.readLine();
        while (!checkAcNumLength(acNum) || checkAcnumDuplication(acNum)){
            System.out.println("이미 있는 계좌번호거나, 6자리가 아닙니다.");
            System.out.println("다시 입력해주세요.");
            acNum = br.readLine();
        }
        System.out.println("입금하실 금액을 입력하세요.");
        int money = Integer.parseInt(br.readLine());

        accounts.put(acNum,new Account(acNum,money));
        System.out.println("계좌생성이 완료되었습니다.");
    }

//    서비스 2번 조회
        void checkBalance() throws IOException {
            System.out.println("2. 조회 서비스입니다.");
            System.out.println("조회하실 계좌 번호 6자리를 입력해주세요.");
            String acNum = checkAccounts(br.readLine());

            Account a = accounts.get(acNum);
            System.out.println("현재 잔액은 " + a.getBalance() + "원 입니다.");
        }

//        서비스 3번 입금
    void deposit() throws IOException {
        System.out.println("3. 입금 서비스입니다.");
        System.out.println("입금하실 계좌 번호 6자리를 입력해주세요.");
        String acNum = checkAccounts(br.readLine());

        System.out.println("입금하실 금액을 입력하세요.");
        int money = Integer.parseInt(br.readLine());
        Account a = accounts.get(acNum);

        a.plusBalance(money);
        System.out.println("입금이 완료되었습니다.");
        System.out.println("입금 후 잔액:" + a.getBalance() + "원");
    }

//    서비스 4번 출금서비스
    void withdrawal() throws IOException {
        System.out.println("4. 출금 서비스입니다.");
        System.out.println("출금하실 계좌 번호 6자리를 입력해주세요.");
        String acNum = checkAccounts(br.readLine());

        Account a = accounts.get(acNum);
        System.out.println("출금하실 금액을 입력하세요.");
        int money = checkCurrentBalance(a,Integer.parseInt(br.readLine()));

        a.minusBalance(money);
        System.out.println("출금이 완료되었습니다.");
        System.out.println("출금 후 잔액:" + a.getBalance() + "원");
    }

//    서비스 5번 송금 서비스
    void transfer() throws IOException {
        System.out.println("5. 송금 서비스입니다.");
        System.out.println("본인 계좌 번호 6자리를 입력해주세요.");
        String acNum1 = checkAccounts(br.readLine());

        System.out.println("돈을 송금할 계좌 번호 6자리를 입력해주세요.");
        String acNum2 = checkAccounts(br.readLine());

        Account a = accounts.get(acNum1);
        Account b = accounts.get(acNum2);

        System.out.println("송금하실 금액을 입력하세요.");
        int money = checkCurrentBalance(a,Integer.parseInt(br.readLine()));

        a.minusBalance(money);
        b.plusBalance(money);
        System.out.println("송금이 완료되었습니다.");
        System.out.println("송금 후 잔액:" + a.getBalance() + "원");
    }

//    체크용도
//    계좌번호 길이 확인
    boolean checkAcNumLength(String acNum){
        return acNum.length() == 6;
    }

//    해당 계좌가 개설되어있는지 확인
    boolean checkAcnumDuplication(String acNum){
        return accounts.containsKey(acNum);
    }

//    계좌에 보낼 여윳돈이 있는지 확인
    int checkCurrentBalance(Account a, int sendMoney) throws IOException {
        int currentMoney = a.getBalance();
        while (sendMoney>currentMoney){
            System.out.println("잔액이 부족합니다. 다시 입력해주세요.");
            sendMoney = Integer.parseInt(br.readLine());
        }
        return sendMoney;
    }

//    계좌 확인 while문
    String checkAccounts(String acNum) throws IOException {
        while (!checkAcnumDuplication(acNum)){
            System.out.println("없는 계좌번호입니다.");
            System.out.println("다시 입력해주세요.");
            acNum = br.readLine();
        }
        return acNum;
    }

}


class Account{
    static int staticId ;
    private int id ;
    private String acNumber;
    private int balance;

    public Account(String acNumber, int balance) {
        this.acNumber = acNumber;
        this.balance = balance;
        this.id = staticId;
        staticId += 1;
    }

    public String getAcNumber() {
        return acNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void plusBalance(int money){
        this.balance += money;
    }

    public void minusBalance(int money){
        this.balance -= money;
    }

}
