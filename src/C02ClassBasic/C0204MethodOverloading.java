package C02ClassBasic;

public class C0204MethodOverloading {
    public static void main(String[] args) {
        C0204MethodOverloading c1 = new C0204MethodOverloading();
        c1.sum(1, 2, 3);
    }

    //    접근제어자를 안붙이면 기본적으로 default 접근제어자: 같은 패키지내에서만 접근가능
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

//    매개변수의 타입 또는 개수 또는 메서드 리턴타입이 다르다면 같은 이름의 메소드를 만들 수 있음. 이것을 오버로딩이라고 함.
    double sum(double a, double b) {
        return a + b;
    }

}