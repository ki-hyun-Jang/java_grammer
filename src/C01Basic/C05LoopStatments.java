package C01Basic;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatments {
    public static void main(String[] args) {
//        int a = 2;
//        while (a<=10){
//            System.out.println(a);
//            a+=1;
//        }

//        2~10까지 출력하는 while예제
//        입력한 숫자의 구구단 단수 출력
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int count = 1;
//        while (count < 10){
//            System.out.printf("%d X %d = %d %n",input,count,input*count);
//            count += 1;
//        }
//        int answer = 1234;
//        int count = 0;
//        while(count<5){
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            if (answer == input) {
//                System.out.println("비밀번호 일치 문이열렸어요");
//                break;
//            } else {
//                System.out.println("비밀번호 틀림");
//            }
//            count += 1;
//            if (count==5){
//                System.out.println("5회 이상초과");
//                break;
//            }
//        }

//        1~10에 홀수만 출력하기
//        int result = 0;
//        for (int i = 2; i<21; i+=2){
//            result += i;
//        }
//        System.out.println(result);

//        최대 공약수 찾기
//        System.out.println(solution(36,24));
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        int count = 0;
//        for(int i = 1; i<input+1; i++){
//            if (input%i==0){ count+= 1; }
//        }
//        if (count == 1){
//            System.out.println("1입니다.");
//        } else if (count==2){
//            System.out.println("소수입니다");
//        }else{
//            System.out.println("합성수입니다.");
//        }

//        continue: 반복문의 조건식으로 이동
//        for(int i = 0; i<11; i++){
//            if (i%2!=0){
//                continue;
//            }
//            System.out.println(i);
//        }

//        배열과 enhanced for문(향상된 for문 for-each문)
//        int[] arr ={1,3,5,7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        일반 for문으로 배열 접근
//        for(int i = 0; i<4; i++){
//            System.out.println(arr[i]);
//        }

//        향상된 for문으로 배열 접근, 값의 개수만큼 반복횟수 결정
//        for(int i:arr){
//            System.out.println(i);
//        }

//        일반 for문을 통해 arr으, 저장된 값 변경
//        for(int i = 0; i<4; i++){
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr);

//        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(num>1){
//            int abc=20;
//            num = 20;
//        }
//        abc=30; if문 중괄호 밖에서는 abc변수의 존재를 모른다.
//        System.out.println(num);

//        for(int i = 2; i<10; i++){
//            System.out.println(i+"단입니다.");
//            for(int j = 1; j<10; j++){
//                System.out.println(i + "X" + j + "=" + i*j);
//            }
//        }
//        라벨문: 반복문에 이름을 붙이는 것.
//        for(int i = 0; i<5; i++){
//            for(int j=0; j<5; j++){
//                System.out.println("hello world");
//            }
//        }
//        int num = 11;
//
//        int[][] arr = {{1,2,3},{4,5,11},{7,8,9},{10,11,12}};
//        Loop1:
//        for(int i = 0; i<4; i++){
//            for(int j=0; j<3; j++){
//                if (num == arr[i][j]){
//                    System.out.println(i+" "+j);
//                    break Loop1;
//                }
//            }
//        }

        for(int i = 100; i<201; i++){
            boolean check = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
                break;
            }
        }

    }

    static int solution(int a, int b){
        if (a < b){ int c=a; a=b; b=c;}
        if (b==0){return a;}
        return solution(b,a%b);
    }
}
