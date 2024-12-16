package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Deque<Integer> dq = new ArrayDeque<>();
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static void main(String[] args) throws IOException {
//        초기세팅
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nmv = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean[] visited = new boolean[nmv[0]+1];
        boolean[] visited2 = new boolean[nmv[0]+1];

        for(int i = 0; i<=nmv[0]; i++) graph.add(new ArrayList<>());
        for(int i = 0; i<nmv[1]; i++) {
            int[] node = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph.get(node[0]).add(node[1]);
            graph.get(node[1]).add(node[0]);
        }

        for(ArrayList<Integer> a :graph) a.sort(Comparator.naturalOrder());
        dq.add(nmv[2]);
        System.out.println(graph);
        dfs(nmv[2], visited);
        sb.append("\n");
        bfs(nmv[2], visited2);
        System.out.println(sb);
    }

    static void bfs(int start, boolean[] visited){
        dq.addLast(start); // 시작노드
        visited[start] = true; // 방문처리
        while(!dq.isEmpty()){
            int value = dq.pollFirst();
            sb.append(value+" ");

            for(int v : graph.get(value)){
                if (!visited[v]){
                    dq.addLast(v);
                    visited[v] = true;
                }
            }
        }
    }

    static void dfs(int start, boolean[] visited){

        sb.append(start+" ");
        for(int v : graph.get(start)){
            if (!visited[v]){
                visited[v] = true;
            }
        }
    }
}
