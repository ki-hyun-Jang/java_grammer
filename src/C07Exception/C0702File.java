package C07Exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class C0702File {
    public static void main(String[] args) throws IOException {
//        콘솔창에 입력값 읽기
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);

////        파일에서 읽기
//        BufferedReader br2 = new BufferedReader(new FileReader("src/C07Exception/test1.txt"));
//        String line = br2.readLine();
//        while (line != null){
//            System.out.println(line);
//            line = br2.readLine();
//        }

//        NIO패키지를 사용한 파일읽기
//        Path filePath = Paths.get("src/C07Exception/test1.txt");
//        문자열 전체를 read
//        String str = Files.readString(filePath);
//        System.out.println(str);

//        문자열을 라인별로 잘라서 list형태로 read
//        List<String> str2 = Files.readAllLines(filePath);
//        for (String s: str2) System.out.println(s);

//        파일쓰기
        Path filePath = Paths.get("src/C07Exception/test1.txt");
//        APPEND추가 WRITE덮어쓰기 CREATE_NEW 생성
        Files.write(filePath, "홍길동4\n".getBytes(), StandardOpenOption.APPEND);
        Files.write(filePath, "홍길동4\n".getBytes(), StandardOpenOption.WRITE);
    }
}
