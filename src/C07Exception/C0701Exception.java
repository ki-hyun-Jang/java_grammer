package C07Exception;

import java.sql.SQLException;
import java.util.Scanner;

public class C0701Exception {
    public static void main(String[] args) {

////        일반적인 예외처리 방식
//        System.out.println("나눗셈 프로그램입니다.");
//        Scanner sc = new Scanner(System.in);
////        에러가 발생할 것으로 예상되는 코드에 try로 감싼다.
//        try {
//            System.out.println("분자를 입력해주세요.");
//            int head = Integer.parseInt(sc.nextLine());
//            System.out.println("분모를 입력해주세요");
//            int tail = Integer.parseInt(sc.nextLine());
//
//            int result = head/tail;
//            System.out.println("두 수를 나눈 값은 " + result);
//            System.out.println("고마워요~");
//        }catch (ArithmeticException error){
//            System.out.println("0으로 나누면 곤란합니다.");
//            error.printStackTrace();di
//        } catch (NumberFormatException error) {
//            System.out.println("문자 입력하지마요");
//            error.printStackTrace();
////        Exception클래스는 모든 예외클래스의 조상클래스
//        } catch (Exception e){
//            System.out.println("예상치 못한 예외가 발생했습니다.");
//            System.out.println(e.getMessage());
//        }finally {
////            예외가 발생하거나 안하거나 무조건 실행되는 구문이다.
//            System.out.println("무조건 실행되는 구문입니다.");
//        }

        System.out.println("로그인을 위한 비밀번호를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
//        login(password);

//        checked exception의 경우에는 예외처리를 위임받게 되면, 반드시 예외처리를 해줘야 함.
        try {
            login2(password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //    throws키워드를 통해 예외를 위임. 다만 uncheck예외에서는 예외가 강제가 아니므로, throws가 큰의미가 없음.
    static void login(String pw) throws IllegalArgumentException {
        if (pw.length() < 10) {
            System.out.println("비밀번호 길이가 너무 짧습니다.");
//            throw new: 예외를 강제로 발생
//            uncheck예외는 예외처리가 강제되지 않음.
//            예외는 기본적으로 메서드를 호출한쪽으로 전파된다.
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        } else {
            System.out.println("로그인 되었습니다.");
        }
    }

    static void login2(String pw) throws SQLException {
        if (pw.length() < 10) {
            System.out.println("비밀번호 길이가 너무 짧습니다.");
//            checked exception은 예외처리를 강제한다.
//            해당 메서드르내에서 예외처리를 하거나, 예외를 throws해야함.
            throw new SQLException("비밀번호가 너무 짧습니다.");
        } else {
            System.out.println("로그인 되었습니다.");
        }
    }
}
