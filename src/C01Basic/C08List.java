package C01Basic;

import java.util.ArrayList;
import java.util.List;

public class C08List {
    public static void main(String[] args) {
////        List 선언방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
//        // 일반적인 list선언 방식
//        List<String> myList3 = new ArrayList<>();
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//
////        초기값 생성방법2. 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList = new ArrayList<>(Arrays.asList(arr));
//
//        int[] intArr = {10,20,30,40,50};
//        List<Integer> intList = new ArrayList<>();
//        for(int i : intArr) intList.add(i);

////        add메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0,30);
//        System.out.println(myList);
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.addAll(myList2);
//
////        get(index): 특정 index의 요소를 반환
//        System.out.println(myList.get(0));
//
////        size: 리스트의 개수 반환
//        System.out.println(myList.size());
//
////        for문을 활용해 list의 값 하나씩 모두 출력
//        for(Integer e : myList) System.out.println(e);
//        for(int i = 0; i<myList.size(); i++) System.out.println(myList.get(i));

//        remove: 요소삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
////        1)index로 삭제, 2)value로 삭제
//        myList.remove(0);
//        myList.remove(Integer.valueOf(20));
////        set(index,value): 인덱스 위치 자리에 value값 setting(변경)
//        myList.set(0,50);
//        System.out.println(myList);
//
////        clear : 요소 전체 삭제
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList.isEmpty());

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(20);
//        myList.add(30);
////        indexOf: 가장 먼저 나오는 값의 index return
//        System.out.println(myList.indexOf(20));

//        리스트 정렬: Collections.sort(), 객체면.sort()
//        List<Integer>  myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//
////        방법1. Collections.sort()
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList,Collections.reverseOrder());
//        System.out.println(myList);
//
////        방법2. 객체명.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);

//        이중리스트: 리스트안에 리스트
//        {1,2,3}, {10,20}, {100,200,300}
//        List<List<Integer>> myList = new ArrayList<>();
//
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.get(0).add(1);
//        myList.get(0).add(2);
//        myList.get(0).add(3);
//        myList.get(1).add(10);
//        myList.get(1).add(20);
//        myList.get(1).add(30);
//        myList.get(2).add(100);
//        myList.get(2).add(200);
//        myList.get(3).add(300);
//
////        리스트안에 배열
//        List<int[]> myList2 = new ArrayList<>();
//        myList2.add(new int[2]);
//        myList2.add(new int[3]);
//        myList2.add(new int[]{1,2});
//        myList2.add(new int[]{1,2,3,4});
//        myList2.get(0)[0] = 10;
//        myList2.get(0)[1] = 20;
//        myList2.get(1)[0] = 100;
//        myList2.get(1)[1] = 200;
//        myList2.get(1)[2] = 300;

//        contains: 값이 있는지 여부를 리턴
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        if (myList.contains(10)){
            System.out.println("10 있어요");
        }
    }
}
