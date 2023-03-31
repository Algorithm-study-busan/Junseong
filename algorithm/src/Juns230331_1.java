import java.io.*;
import java.util.*;
public class Juns230331_1 {
    public static LinkedList<Integer>[] edges;
    static boolean[] visited;

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int cur = q.poll();

            for (int next : edges[cur]){
                if (visited[next]) continue;
                q.add(next);
                visited[next] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        edges = new LinkedList[N+1];
        visited = new boolean[N+1];
        for (int i = 0; i < N + 1; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < N+1; i++) {
            edges[i] = new LinkedList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            String[] b = br.readLine().split(" ");
            edges[Integer.parseInt(b[0])].add(Integer.parseInt(b[1]));
            edges[Integer.parseInt(b[1])].add(Integer.parseInt(b[0]));
        }

        bfs(1);

        int count = 0;
        for (int i = 2; i < N+1; i++) {
            if(visited[i]) count++;

        }
        System.out.println(count);

    }
}
