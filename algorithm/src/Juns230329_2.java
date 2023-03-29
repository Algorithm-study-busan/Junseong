import java.io.*;
import java.util.*;
public class Juns230329_2 {
    public static LinkedList<Integer>[] edges;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] b = a.split(" ");
        int N = Integer.parseInt(b[0]);
        int M = Integer.parseInt(b[1]);
        int V = Integer.parseInt(b[2]);
        edges = new LinkedList[N+1];
        for (int i = 0; i < N+1; i++) {
            edges[i] = new LinkedList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            String c = br.readLine();
            String[] d = c.split(" ");
            edges[Integer.parseInt(d[0])].add(Integer.parseInt(d[1]));
            edges[Integer.parseInt(d[1])].add(Integer.parseInt(d[0]));
        }
        visited = new boolean[N+1];
        for (int i = 0; i < N+1; i++) {
            visited[i] = false;
        };
        for (int i = 0; i < N+1; i++) {
            Collections.sort(edges[i]);
        }
        dfs(V);
        System.out.println();
        for (int i = 0; i < N+1; i++) {
            visited[i] = false;
        };
        bfs(V);



    }

    public static void dfs(int cur) {
        System.out.print(cur + " ");
        for (int next : edges[cur]){
            visited[cur] = true;
            if (visited[next]) continue;

            dfs(next);
        }

    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int cur = q.poll();


            System.out.print(cur +" ");
            for (int next : edges[cur]) {
                if (visited[next]) continue;
                q.add(next);
                visited[next] = true;
            }
        }
    }

}
