import java.io.*;
import java.util.*;


public class Juns230426_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] org = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> ranking = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            sorted[i] = org[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        int rank = 0;
        for(int v : sorted) {
            if(!ranking.containsKey(v)) {
                ranking.put(v,rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int key : org) {
            int rk = ranking.get(key);
            sb.append(rk).append(' ');
        }
        System.out.println(sb);
    }
}
