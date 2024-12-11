package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {

        if(isPrime(10)) System.out.println("소수입니다.");
        else System.out.println("소수가 아닙니다.");

    }

    public static boolean isPrime(int n){
        if(n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
