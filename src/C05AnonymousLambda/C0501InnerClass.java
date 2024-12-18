package C05AnonymousLambda;

public class C0501InnerClass {
    public static void main(String[] args) {
        MemberInnerClass.StaticInnerClass si = new MemberInnerClass.StaticInnerClass();
        si.display();
    }
}

//(일반)내부클래스
class MemberInnerClass {
    int a;
    void display(){
        System.out.println("a의 값은 "+this.a);
    }
//    static내부클래스: 밖의 MemberInnerClass의 Static변수처럼 활용
    static class StaticInnerClass{

        int b ;

        void display(){
            System.out.println("b의 값은 "+ this.b);
        }
    }

}