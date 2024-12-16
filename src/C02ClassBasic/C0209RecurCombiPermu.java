package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C0209RecurCombiPermu {
    List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
//        숫자가 1,2,3,4가 있을 때
//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        List<List<Integer>> result = new ArrayList<>();

//        myList로 만들 수 있는 2개의 숫자조합을 출력
//        for(int i = 0; i<myList.size(); i++){
//            for (int j = i+1; j<myList.size(); j++){
//                List<Integer> temp = new ArrayList<>();
//                temp.add(myList.get(i));
//                temp.add(myList.get(j));
//                result.add(temp);
//            }
//        }
//        System.out.println(result);
        List<List<Integer>> answer = new ArrayList<>();
        List<List<Integer>> answer2 = new ArrayList<>();
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        combi(answer,myList,3,new ArrayList<>(),0);
        System.out.println(answer);
        List<Boolean> visited = new ArrayList<>();
        visited.add(false);
        visited.add(false);
        visited.add(false);
        visited.add(false);
        permu(answer2,myList,3,new ArrayList<>(),visited);
        System.out.println(answer2);
    }
//    현재리스트,목표길이,현재위치
//    목표길이에 도달하거나, 현재위치가 끝이면 중지
    static void combi(List<List<Integer>> answer,List<Integer> myList, int target, List<Integer> currentList, int currentIndex){
        if(target<=currentList.size()){
            answer.add(new ArrayList<>(currentList));
            return;
        }
        if(myList.size() <= currentIndex) return;

        for(int i = currentIndex; i< myList.size(); i++){
            List<Integer> temp = new ArrayList<>(currentList);
            temp.add(myList.get(i));
            combi(answer, myList, target, temp,i+1);
        }
    }

    static void permu(List<List<Integer>> answer,List<Integer> myList, int target, List<Integer> currentList, List<Boolean> visited){
        if(target<=currentList.size()){
            answer.add(new ArrayList<>(currentList));
            return;
        }

        for(int i = 0; i< myList.size(); i++){
            if (visited.get(i)) continue;
            List<Integer> temp = new ArrayList<>(currentList);
            List<Boolean> temp2 = new ArrayList<>(visited);
            temp.add(myList.get(i));
            temp2.set(i,true);
            permu(answer, myList, target, temp,temp2);
        }
    }

}
