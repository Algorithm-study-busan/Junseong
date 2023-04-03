import java.io.*;
import java.util.*;

public class Juns230402_1 {
    static int N;
    static int K;

    static int visited[] = new int[100001];

    static int bfs(int start){
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(start);
        int index = start;
        int n = 0;
        visited[index] = 1;
        while(!q.isEmpty()) {
            n = q.poll();

            if (n == K){
                return visited[n]-1;
            }
            if (n-1>=0 && visited[n-1] == 0)
            {
                visited[n-1] = visited[n]+1;
                q.add(n-1);
            }
            if (n+1 <= 100000 && visited[n+1] == 0)
            {
                visited[n+1] = visited[n]+1;
                q.add(n+1);
            }
            if (2*n <= 100000 && visited[2*n] == 0)
            {
                visited[2*n] = visited[n] + 1;
                q.add(2*n);
            }

        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        N = Integer.parseInt(a[0]);
        K = Integer.parseInt(a[1]);

        int result = bfs(N);
        System.out.println(result);


    }
}
