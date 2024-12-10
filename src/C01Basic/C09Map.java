package C01Basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C09Map {
    public static void main(String[] args) {
////        Map은 index가 없기에 순서가 무의미
////        key값은ㅇ 중복되지 않고, 만약 동일한 key값으로 다른 value를 넣으면 value를 덮어쓰기함
//        Map<String, String> sports = new HashMap<>();
//        sports.put("basketball","농구");
//        sports.put("soccer","축구");
//        sports.put("baseball","야구");
//        sports.put("baseball","공놀이"); // 덮어쓰기
//        System.out.println(sports);
//
////        Map은 key를 통해 value를 get
////        복잡도 O(1)
//        System.out.println(sports.get("baseball"));
//
////        remove: 키를 통해 삭제
//        sports.remove("baseball");
//        System.out.println(sports);
//
////        putIfAbsent: key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//        sports.putIfAbsent("baseball", "야구");
//        System.out.println(sports);
////        getOrDefault: key가 없으면 default값으로 return
//        System.out.println(sports.get("pingpong"));
//        System.out.println(sports.getOrDefault("pingpong", "그런키없음"));
//        System.out.println(sports.getOrDefault("baseball", "그런키없음"));
//
////        containsKey: 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("baseball"));
//        System.out.println(sports.containsKey("pingpong"));
//
////        Map의 전체데이터 조회 방법
//        for( Map.Entry<String, String> KV :sports.entrySet()) {
//            System.out.println(KV.getKey());
//            System.out.println(KV.getValue());
//        }
//
//        String[] arr = {"농구","축구","농구","야구","축구"};
//        Map<String, Integer> sports = new HashMap<>();
//
//        for(String str: arr){
//            sports.put(str, sports.getOrDefault(str,0)+1);
//        }

////        LinkedHashMap: 데이터 삽입순서를 보장(유지)
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5",1);
//        linkedMap.put("hello4",2);
//        linkedMap.put("hello3",3);
//        linkedMap.put("hello2",4);
//        linkedMap.put("hello1",5);
//        for(String s: linkedMap.keySet()) System.out.println("key값은 "+s);
////        TreeMap: key를 통해 데이터를 정렬
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5",1);
//        treeMap.put("hello4",2);
//        treeMap.put("hello3",3);
//        treeMap.put("hello2",4);
//        treeMap.put("hello1",5);
//        for(String s: treeMap.keySet()) System.out.println("key값은 "+s);

////        HashMap를 사용해서 정렬
//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("hello5",1);
//        myMap.put("hello4",2);
//        myMap.put("hello3",3);
//        myMap.put("hello2",4);
//        myMap.put("hello1",5);
//        List<String> myList = new ArrayList<>();
//
//        for(String a: myMap.keySet()){
//            myList.add(a);
//        }
//        myList.sort(Comparator.naturalOrder());
//
//        for(String s: myList) {
//            System.out.println("key값은 "+s);
//            System.out.println("value값은"+myMap.get(s));
//        }
//
//        Collections.sort(myList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(o1) - myMap.get(o2);
//            }
//        });
//        System.out.println(myList);

//        hashMap출력방법 두 가지: 1.향상된 for문, 2.iterator
        Map<String, String> myMap = new HashMap<>();
        myMap.put("basketball","농구");
        myMap.put("soccer","축구");
        myMap.put("baseball","야구");
//        for(String a: myMap.keySet()){
//            System.out.println(a);
//        }
        Iterator<String> myIters = myMap.keySet().iterator();
//        next멤서드는 데이터를 하나씩 소모시키면서 값을 반환
        System.out.println(myIters.next());
//        hasNext: Iterator안에 그 다음 값이 있는지 없는지 boolean return
        while(myIters.hasNext()){
            System.out.println(myIters.next());
        }


    }
}
