package C01Basic;

import java.util.*;

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

        String[] arr = {"농구","축구","농구","야구","축구"};
        Map<String, Integer> sports = new HashMap<>();

        for(String str: arr){
            sports.put(str, sports.getOrDefault(str,0)+1);
        }

    }
}
