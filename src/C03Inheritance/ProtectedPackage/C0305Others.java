package C03Inheritance.ProtectedPackage;

//final class는 상속이 불가하다.
//public class C0305Others extends FinalParents{
public class C0305Others{
    public static void main(String[] args) {

//        추상클래스는와 인터페이스는 별도의 구현없이 객체생성 불가
//        AbstractAnimal a1 = new AbstractAnimal();
//        List<Integer> list1 = new List<Integer>();
    }
}

// abstract메서드가 하나라도 있으면 클래스에도 abstract키워드가 붙어야 함.
abstract class AbstractAnimal{
    void makeSound(){
        System.out.println("동물소리를 냅니다");
    }
//    리턴타입과 매개변수만 있는 메서드 선언만 존재.
    abstract void makeSound2();
}

class AbstractDog extends AbstractAnimal {
// abstract클래스를 상속받을 때에는 오버라이딩이 강제된다.
    @Override
    void makeSound2() {
        System.out.println("멍멍");
    }
}

final class FinalParents{

}
