package C02ClassBasic;

public class C0208RecursiveBasic {
    public static void main(String[] args) {
//        for문으로 1~10누적합계
        int result = 0;
        for(int i = 0; i<=10; i++){
            result += i;
        }
        System.out.println(result);
        System.out.println(factorial(5));
        System.out.println(fibo(7));

//        재귀함수로 1~10까지 누적합계
        System.out.println(addSumAcc(10));
    }
    public static int addSumAcc(int n){
        if(n<=0) return 0;
        return n+addSumAcc(n-1);
    }

    public static int factorial(int n){
        if (n==0||n==1) return 1;
        return factorial(n-1)*n;
    }

    public static int fibo(int n){
        if (n<=2) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}
