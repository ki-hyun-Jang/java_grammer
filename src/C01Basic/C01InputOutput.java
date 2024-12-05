package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
//        출력: System.out을 통해 콘솔출력
        System.out.println(20); // sout 단축어 사용가능
        System.out.print("Hello world");
        System.out.println("Hello world2");

//        입력: System.in(키보드 입력) + Scanner (입력을 위한 클래스)
        int a = 10; //10이라는 정수를 변수 a에 할당
        Scanner myScanner = new Scanner(System.in); // Scanner객체를 변수 myScanner에 할당
//        nextLine 메서드: 입력받은 데이터를 한 줄로 읽어서, String으로 return
        String inputLine = myScanner.nextLine();
        System.out.println("입력사항: " + inputLine);
//        입력: System.in + BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input);

        String[] input2 = br.readLine().split("");
    }
}
