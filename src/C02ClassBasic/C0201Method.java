package C02ClassBasic;

public class C0201Method {
    public static void main(String[] args) {
//        for문을 활용해 1~10까지 total값을 출력
        int total =0;
        for(int i =1; i<=10; i++){
            total += i;
        }
        System.out.println(total);
//        for문을 활용해 10~20까지 total 값을 출력
        int total2 =0;
        for(int i =10; i<=20; i++){
            total2 += i;
        }
        System.out.println(total2);

//        코드에 중복이 발생하므로, 중복을 피하기 위해 위 코드의 기능을 별도로 분리
//        기본 호출 방식: 클래스명.메서드
        System.out.println(C0201Method.sumAcc(10,1));
//        같은 클래스내에서 정의된 클래스메서드이 호출은 클래스명 생략가능
        System.out.println(sumAcc(10,1));
    }

//    int return type
//    매개변수로서 int 2개 정의
//    메서드 구성 요소 : 접근제어자, 클래스메서드 여부
    public static int sumAcc(int start, int end){
        if (start > end){
            int temp = start;
            start = end;
            end = temp;
        }
        int total = 0;
        for(int i = start; i<=end; i++){
            total += i;
        }
        return total;
    }
}
