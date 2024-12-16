package C03Inheritance;

public class C0302SuperKeyword extends SuperParents {
    int a ;
    public C0302SuperKeyword() {
        super(10);
        a=20;
    }

    //    부모클래스(SuperParents)에 인스턴스 변수 a선언 후 10할당
//    부모클래스에 인스턴스 메서드 display안에 "부모클래스입니다." 출력
//    자식 클래스에서 부모클래스의 변수 a출력, 부모클래스의 display호출
    public static void main(String[] args) {
        C0302SuperKeyword c1 = new C0302SuperKeyword();
//        System.out.println(c1.a);
//        System.out.println(c1.super.a);
        c1.display2();
    }

    void display2(){
        System.out.println(a);
        System.out.println(super.a);
    }
}

class SuperParents{
    int a ;

    public SuperParents(int a) {
        this.a = a;
    }


    void display(){
        System.out.println("부모클래스입니다.");
        System.out.println(this.a);
    }
}
