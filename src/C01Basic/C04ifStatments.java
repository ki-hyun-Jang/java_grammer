package C01Basic;
import java.util.Scanner;

public class C04ifStatments {

    public static void main(String[] args) {

//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (answer == input) {
//            System.out.println("비밀번호 일치 문이열렸어요");
//        } else {
//            System.out.println("비밀번호 틀림");
//        }

        // 버스카드 예제
//        System.out.println("현재 얼마 가지고 계신가용?");
//        Scanner sc = new Scanner(System.in);
//        int myMoney = sc.nextInt();
//        if,else if 구문에서 조건식은 택1로서, 한 조건에 해당하면 실행 후 전체구문 밖으로 나감
//        if(myMoney >= 10000){
//            System.out.println("택시타라잉");
//        } else if (myMoney >= 3000) {
//            System.out.println("버스타라잉");
//        } else if (myMoney >= 2000) {
//            System.out.println("킥보드타라잉");
//        }else{
//            System.out.println("걸어가라잉");
//        }

//        if문이 독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면,
//        모든 if문이 중복되어 실행될 가능성이 존재.
//        if(myMoney >= 10000){
//            System.out.println("택시타라잉");
//        } if (myMoney >= 3000) {
//            System.out.println("버스타라잉");
//        } if (myMoney >= 2000) {
//            System.out.println("킥보드타라잉");
//        }else{
//            System.out.println("걸어가라잉");
//        }

        //    삼항연산자: 조건 ? 참일 경우 : 거짓일경우
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        String result = answer == input ? "문이 열렸어용" : "비밀번호 틀림여";
//        System.out.println(result);

//        switch문: if, else if 등의 조건문을 가독성있게 표한하는 구문
        System.out.println("원하시는 서비스 번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input){
            case 0:
                System.out.println("상담사연결"); break;
            case 1:
                System.out.println("대출업무"); break;
            case 2:
                System.out.println("예금업무"); break;
            case 3:
                System.out.println("적금업무"); break;
            default:
                System.out.println("잘못된 입력입니다."); break;
        }

    }
}
