package C02ClassBasic;

public class C0203Scope {
//    클래스변수는 클래스 전역에서 접근이 가능하다.
    static int v2 = 10;
    public static void main(String[] args) {
//      지역번수의 유효범위
        int v1 = 10;
        System.out.println(v1);

//        객체의 유효범위
        C0202Person p1 = new C0202Person();
        p1.setAge(20);
        scope2(p1);
        System.out.println(p1.getAge());

//        클래스변수의 유효범위
        System.out.println(v2);


    }

    public static void scope(int a){
        a = 20;
        System.out.println(a);
    }

    public static void scope2(C0202Person person){
        person.setAge(30);
        System.out.println(person.getAge());
    }
}

