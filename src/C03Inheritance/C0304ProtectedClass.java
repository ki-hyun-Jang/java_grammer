package C03Inheritance;

// class에는 public과 default 접근제어자만 존재

public class C0304ProtectedClass {
//    변수, 메서드에는 4가지 접근제어자가 존재
//    public: 프로젝트 전체에서 접근가능(다른 패키지여도 접근이 가능)
//    protected: 패키지를 벗어나도라도 상속관계에 한해서 접근가능
//    default: 패키지내에서만 접근가능
//    private: 클래스내에서만 접근이 가능
    private  String st1 = "hello java1";
    String st2 = "hello java2";
    protected   String st3 = "hello java3";
    public   String st4 = "hello java4";
}
