package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            int m = Integer.parseInt(br.readLine());
            arr[i] = m;
        }
        sb.append(Math.round(Arrays.stream(arr).average().getAsDouble()) + "\n");
        Arrays.sort(arr);
        sb.append(arr[n/2] + "\n");

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = Collections.max(map.values());
        List<Integer> modeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modeList.add(entry.getKey());
            }
        }
        Collections.sort(modeList);
        sb.append(modeList.size() == 1 ? modeList.get(0) : modeList.get(1)).append("\n");

        sb.append(arr[n - 1] - arr[0] + "\n");

        System.out.println(sb);
    }
}
