package C01Basic;

public class C06String {

    public static void main(String[] args) {
//        참조자료형: 기본 자료형을 제외한 모든 자료형
//        WrapperClass: 기본형 타입을 Wrappering한 클래스
//        int a = 10;
//        Integer b = new Integer(10);
////        오토 언박싱: WrapperClass -> 기본자료형
//        int c= b;
////        오토 박싱: WrapperClass 형변환
//        Integer d = a;

//        String과 int의 형변환
//        int a = 10;
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);

//        배열에는 원시타입 자료형 세팅
//        int[] arr1 = {10,20,30};

//        리스트에는 참조자료형 세팅
//        참조자료형에 원시자료형을 담을 때는 Wrapper클래스를 써야함.
//        List<Integer> list1 = new ArrayList<>();


//        String str = new String("h2");
//         리터럴방식 허용: 권장되는 방식임 성능최적화가 되어 있음.
//        String str2 = "zz";
//        참조자료형이므로, ==비교는 메모리주소가 되고, 값을 비교할 때에는 .equals사용
//        System.out.println(str.equals(str2));

//        소문자 알파벳의 개수 구하기
//        String st3 = "hello java1 world2";
//        int count = 0;
//        for(int i = 0; i<st3.length(); i++){
//            if (Character.isLowerCase(st3.charAt(i))) count+=1;
//        }
//        System.out.println(count);
//
//        int count2 = 0;
//        String st4 = "abcdefabaadf";
//        for(int i = 0; i<st4.length(); i++){
//            if (st4.charAt(i) == 'a') count2+=1;
//        }
//        System.out.println(count2);

//        toCharArray(): String 문자열을 배열로 리턴
//        char[] chArr = st4.toCharArray();
//        for(char ch: chArr){
//            if(ch=='a')count2+=1;
//        }
//        System.out.println(count2);

//        String st1 = "hello java java";
//        indexOf: 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        System.out.println(st1.indexOf("java"));

//        contains : 특정 문자열이 있는지 여부를 boolean
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));

//        문자열 더하기: +=
//        String st1 = "abcf";
////        st1 += "world";
//        int len = st1.length()/2;

//        trim, strip: 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello world  ";
//        String trimSt1 = st1.trim();
//        String stripSt1 = st1.strip();
//        System.out.println(trimSt1);
//        System.out.println(stripSt1);

//        toUpperCase: 대문자로 변환, toLowerCase: 소문자로 변경
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        System.out.println(s1);
//        System.out.println(s2);

//        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
////        String -> char
//        char ch2 = st1.charAt(0);

//        replace(a, b): a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");

//        replaceAll(a,b): replace와 동일, 정규표현식을 쓸 수 있는점이 차이.
//        String st1 = "010abc123한글123";
////        for문 활용해서 소문자 알파벳만 제거한 새로운 문자열 생성
//        String answer = "";
//
//        for (int i = 0; i < st1.length(); i++) {
//            if (!Character.isLowerCase(st1.charAt(i))) {
//                answer += st1.charAt(i);
//            }
//        }
////        System.out.println(answer);
////
//////        [a-z]+ : 1개 이상의 소문자 알파벳을 의미
//////        [A-Za-z]+ : 대소문자 포함한 알파벳을 의미
//////        [가-힣]+ : 한글
//////        [0-9]+ : 숫자
////        String answer2 = st1.replaceAll("[가-힣]+","");
////        System.out.println(answer2);
//
//        String input = "Hello가나다";
//        System.out.println(input.matches("[A-z]"));
//
////        전화번호 검증
//        String number = "010-1234-5678";
//        boolean b1 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number);
//        System.out.println(b1);
//
////        이메일 검증: 소문자@소문자.com
//        String email = "helㅎ2lo@naver.com";
//        System.out.println(Pattern.matches("^[a-z]+@[a-z]+.com$", email));
//
////        split: 특정문자를 기준으로 문자열을 자르는 것
//        String a = "a:b:c:d";
//        String[] arr1 = a.split(":");
//        System.out.println(Arrays.toString(arr1));
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        System.out.println(Arrays.toString(arr2));

//        null과 공백의 차이
//        String st1 = null; //null은 String이 아님
//        String st2 = "";
//        String st3 = "hello";
//        System.out.println(st1.isEmpty()); // nullPonterException

//        StringBuffer: 문자열 조립
//        String[] arr = {"python","java", "abc"};
//        String answer = "";
//        for(int i =0; i<arr.length; i++){
//            answer += arr[i];
//        }
////        문자열조립2
//        String answer2 = String.join(":",arr);
//        System.out.println(answer2);
//
////        StringBuffer: 문자열조립
//        StringBuffer sb = new StringBuffer();
//        sb.append("java");
//        sb.append("python");
//        sb.append("abc");
//        String answer3 = sb.toString();

//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("java");
//        sb2.append("\n");
//        sb2.append("python");
//        sb2.append("\n");
//        sb2.append("javascript");
//        sb2.append("\n");
//        String answer4 = sb2.toString();
//        System.out.println(answer4);

//        문자열 뒤집기
        String st1 = "hello";
        String answer = "";
        for (int i = st1.length()-1; i>-1; i--){
            answer += st1.charAt(i);
        }

        StringBuilder sb = new StringBuilder(st1);
        String answer2 = sb.reverse().toString();

        System.out.println(st1.substring(1,1));
        String A = "hello";
        String B = "ohell";

    }
}
