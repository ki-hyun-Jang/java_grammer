package C07Exception.AuthorException;

import java.util.NoSuchElementException;
import java.util.Scanner;

//사용자의 입출력을 받아 처리하는 계층(controller)
public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while (true) {
            System.out.println("1번 회원가입, 2번 로그인, 3번 회원목록조회");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            if (input.equals("1")) {
                try {
                    System.out.println("이름을 입력해주세요.");
                    String name = sc.nextLine();
                    System.out.println("이메일을 입력해주세요.");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.nextLine();

                    authorService.register(name, email, password); //email중복방지, password길이 8자리 이상이어야 함.
                }catch (IllegalArgumentException | NoSuchElementException e){
                    System.out.println(e.getMessage());
                }
            } else if (input.equals("2")) {
                try {
                    System.out.println("이메일을 입력해주세요.");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.nextLine();

                    authorService.login(email, password); //이메일과 비밀번호가 맞는지 검증.
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            } else if (input.equals("3")) {
                authorService.findAll(); //전체목록을 서비스로부터 받아와서 출력
            }
        }
    }

}
