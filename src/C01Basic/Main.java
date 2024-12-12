package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean[] arr = new boolean[nm[1]+1];
        Arrays.fill(arr,true);

        for(int i = 2; i<=nm[1]; i++){
            if(arr[i]){
                for (int j = i*2; j<nm[1]; j+=i){
                    arr[j] = false;
                }
            }
        }

        for(int i = nm[0]; i<= nm[1]; i++) {
            if(arr[i]) sb.append(i +"\n");
        }
        System.out.println(sb);
    }
}
