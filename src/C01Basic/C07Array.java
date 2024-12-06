package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        배열표현식1. 리터럴 방식
//        int[] intArr1 = {1,3,5,7,9};

//        배열표현식2. 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;

//        참조자료형의 배열은 기본적으로 null초기화
//        참조자료형의 default값은 null이기에 해당 값에 접근하면 오류남
//        String[] stArr = new String[5];
//        stArr[0] = "hello1";
//        stArr[1] = "hello2";
//        stArr[2] = "hello3";

//        표현식3
//        int[] intArr3 = new int[] {1,3,5,7,9};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,2,3,4,5});

//        표현식4: 불가-> 배열의 길이가 사전 지정되어야함
//        int[] intArr4 = new int[];

//        String[] stArr = new String[5];
//        for(int i = 0; i<stArr.length; i++){
//            stArr[i] = "";
//        }
//        Arrays.fill(stArr,"hello");
//
//        // 85, 65, 90인 int배열을 선언하고, 총합, 평균을 구하자.
//        int[] intArr = {85,65,90};
//        int sum = Arrays.stream(intArr).sum();
//        Double avg = (double)sum/intArr.length;
//
////        배열의 최대값, 최소값
//        int[] arr2 = {10,20,30,12,8,17};
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for(int i :arr2){
//            if(min>i) min=i;
//        }
//        for(int i :arr2){
//            if(max<i) max=i;
//        }
//        System.out.println(min);
//        System.out.println(max);

//        배열의 자리 바꾸기
//        int[] arr = {10,20,30,40,50};
//
//        for (int i = 0; i<4; i++){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        배열뒤집기: 새로운 배열을 선언하여, arr을 뒤집은 배열 생성
//        int[] arr = {10,20,30,40,50};
//        int[] arr2 = new int[5];
//        for(int i = arr.length-1; i>-1; i--){
//            arr2[arr.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr2));

//        배열의 정렬
//        int[] arr = {17,12,20,10,25,1};
//
//        for (int i=0; i<arr.length-1; i++){
//            int min = arr[i];
//            int minIndex = i;
//            for(int j=i+1; j<arr.length; j++){
//                if(min>arr[j]){
//                    min=arr[j];
//                    minIndex = j;
//                }
//            }
//            arr[minIndex] = arr[i];
//            arr[i] = min;
//        }
//        System.out.println(Arrays.toString(arr));

//        문자정렬
//        아스키코드(unicode)기준으로 정렬
        String[] fruits = {"banana","apple","cherry"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
//        내림차순: 기본형 타입은 Comparator로 처리불가
        Arrays.sort(fruits, Comparator.reverseOrder());
        int[] arr = {4,6,3,7,1};
//        Arrays.sort(arr,Comparator.reverseOrder());
//        Arrays.sort(arr)하고 뒤집으면 내림차순임
        String[] fruits2 = {"apple","applee","applef"};
        System.out.println();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int start = 1;
        int end = 4;
        int pick = 2;
        int[] a = Arrays.copyOfRange(array,start,end);
        Arrays.sort(a);
        System.out.println(a[pick]);



    }
}
