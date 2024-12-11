package C02ClassBasic;

public class C0202Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(1,2));

//        A부서의 매출
//        MyCalculator.sumAcc(20);
//        System.out.println(MyCalculator.total);
//        MyCalculator.sumAcc(30);
//        System.out.println(MyCalculator.total);
//        MyCalculator.sumAcc(40);
//        System.out.println(MyCalculator.total);
//
////        B부서의 매출
//        MyCalculator.total = 0;
//        MyCalculator.sumAcc(10);
//        MyCalculator.sumAcc(20);
//
////        객체를 사용한 회계 프로그램: 객체 고유의 메모리 공간 할당
//        MyCalculatorInstance m1 = new MyCalculatorInstance();
//        m1.sumAcc(10);
//        m1.sumAcc(20);
//        System.out.println(m1.total);
//        MyCalculatorInstance m2 = new MyCalculatorInstance();
//        m2.sumAcc(30);
//        m2.sumAcc(40);
//        System.out.println(m2.total);
//        System.out.println(MyCalculatorInstance.total_count);

        C0202Person person1 = new C0202Person();
        person1.eating();
        System.out.println(person1.whoIs());

    }

}

class MyCalculator{
    static int total = 0;

    static int sum(int a, int b){
        return a+b;
    }

    static  void sumAcc(int a){
        total += a;
    }
}

class MyCalculatorInstance{
    static int total_count;
    int total = 0;

    MyCalculatorInstance(){
        total_count+=1;
    }

    int sum(int a, int b){
        return a+b;
    }

    void sumAcc(int a){
        this.total += a;
    }
}