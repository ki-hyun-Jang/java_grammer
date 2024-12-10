package C01Basic;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
//        Queue인터페이스를 LinkedList각 구현한 방식을 가장 많이 사용
//        Queue<Integer> q = new LinkedList<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        System.out.println(q.poll());
//        System.out.println(q);
//        System.out.println(q.peek());

//        LinkedList와 ArrayList의 성능비교
//        중간위치에 데이터 add테스트
//        LinkedList<Integer> list1 = new LinkedList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i<100000; i++){
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//
//        long startTime2 = System.currentTimeMillis();
//        for(int i = 0; i<100000; i++){
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//
//        System.out.println(endTime-startTime);
//        System.out.println(endTime2-startTime2);
//
////        조회속도 비교
//        long startTime3 = System.currentTimeMillis();
//        for(int i = 0 ; i<100000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println(endTime3-startTime3);
//
//        long startTime4 = System.currentTimeMillis();
//        for(int i = 0 ; i<100000; i++){
//            list2.get(i);
//        }
//        long endTime4 = System.currentTimeMillis();
//        System.out.println(endTime4-startTime4);

//        길이제한큐: ArrayBlockQueue
        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("ㅎ");
//        blockingQueue.add("ㅎ");
//        blockingQueue.add("ㅎ");
//        blockingQueue.add("ㅎ");
        blockingQueue.offer("ㅎ");
        blockingQueue.offer("ㅎ");
        blockingQueue.offer("ㅎ");
        blockingQueue.offer("ㅎ");
        System.out.println(blockingQueue);

//        우선순위 큐: 데이터를 꺼낼 때 정렬된 데이터가 pop
//        전체 정렬이 아닌, poll할 때 마다 최소값을 보장
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println(pq.poll());






    }

}
