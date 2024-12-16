package C02ClassBasic;

public class C0207FunctuionCall {
    public static void main(String[] args) {
        System.out.println("main함수 시작");
        function1();
        System.out.println("main함수 끝");
    }

    public static void function1(){
        System.out.println("f1 시작");
//        함수가 자기자신을 호출할 경우 재귀함수라고한다.
//        재귀함수에는 종료로직이 없는 경우 스택메모리에 함수가 무한히 쌓여 스택오버플로우 발생
        function2();
        System.out.println("f1 종료");
    }

    public static void function2(){
        System.out.println("f2 시작");
        System.out.println("f2 종료");
    }
}
