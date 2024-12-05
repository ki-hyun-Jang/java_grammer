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

        String st1 = "hello java java";
//        indexOf: 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
        System.out.println(st1.indexOf("java"));

//        contains : 특정 문자열이 있는지 여부를 boolean
        System.out.println(st1.contains("hello"));
        System.out.println(st1.contains("world"));


    }

}
