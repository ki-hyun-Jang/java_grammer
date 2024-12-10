package C01Basic;

import java.util.HashSet;
import java.util.Set;

public class C10Set {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);
////        순서보장X, 중복제거
////        출력 시 index로 접근 불가
//        for(String s : mySet){
//            System.out.println(s);
//        }

//        LinkedHashSet
//        Set<Integer> linkedSet = new LinkedHashSet<>();
//        linkedSet.add(1);
//        linkedSet.add(1);
//        linkedSet.add(0);
//        linkedSet.add(3);
//        linkedSet.add(1);
//        System.out.println(linkedSet);
////        TreeSet
//        Set<Integer> treeSet = new TreeSet<>();
//        treeSet.add(1);
//        treeSet.add(1);
//        treeSet.add(0);
//        treeSet.add(3);
//        treeSet.add(1);
//        System.out.println(treeSet);

//        집한관련 함수: 교집합(retailAll), 합집합(addAll), 차집합(removeAll)
        Set<String> set1 =new HashSet<>();
        Set<String> set2 =new HashSet<>();
        set1.add("java");
        set1.add("python");
        set1.add("javascript");
        set2.add("java");
        set2.add("html");
        set2.add("css");
//        set1.retainAll(set2);
//        set1.addAll(set2);
//        set1.removeAll(set2);
        System.out.println(set1);


    }
}
