package C03Inheritance;

// enxtends 키워드를 통해 상속을 수행
public class C0301Inheritance extends Parents {
    int c = 10;

    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
//        변수 상속
        System.out.println(c1.a);
        System.out.println(c1.c);
//        부모클래스에서 정의된 private 메서드는 자식클래스에서 사용,접근 불가
//        메서드 상속
        c1.m1();
        c1.m2();

    }

//    부모클래스의 메서드를 재정의: oveeriding
//    @Override override임을 명시적으로 표현하는 표현식. 성능으르 위해서 붙여주는 게 더 좋은 것으로 알려져있음.
    @Override
    void m1() {
        System.out.println("자식클래스 입니다.");
    }

    void m2(){
        System.out.println("클래스2입니다.");
    }
}

class Parents {
    int a = 10;
    void m1(){
        System.out.println("클래스입니다.");
    }
}