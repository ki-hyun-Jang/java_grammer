package C03Inheritance.ProtectedPackage;

import C03Inheritance.C0304ProtectedClass;

public class ProtectedTest extends C0304ProtectedClass{
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass();
//        public변수 접근가능
        System.out.println(c1.st4);
//        protected 상속관계가 없을 경우 접근 불가능
//        System.out.println(c1.st3);
//        System.out.println(c1.st2);
//        System.out.println(c1.st1);

//        C0304ProtectedTest p1 = new C0304ProtectedTest();
//        System.out.println(p1.st1);
//        System.out.println(p1.st2);
    }
}
