import java.io.*;
import java.util.*;
public class Juns230508_1 {
    static int[][] map;
    static boolean[][] visited;
    static Queue<spot> q = new LinkedList<>();
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int N,M;
    static int max=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int chk = 0;
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int k = Integer.parseInt(st.nextToken());
                map[i][j] = k;
                if (k==-1 || k==1) {
                    visited[i][j] = true;
                    if (k==1) {
                        q.add(new spot(i,j));
                        chk = 1;
                    }
                }
                else {
                    visited[i][j] = false;

                }
            }
        }

        bfs();
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (chk == 0) {
                res = -1;
            }
            for (int j = 0; j < M; j++) {
                if(!visited[i][j]) {
                    res = -1;
                    break;
                }
            }
            if (res == -1){
                break;
            }
        }
        if (max == 0 && res != -1) {
            System.out.println(max);
        }
        else {
            if (res == 0){
                System.out.println(max-1);
            }
            else{
                System.out.println(-1);
            }
        }
    }
    public static void bfs() {
        while(!q.isEmpty()) {
            spot s = q.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = s.x + dx[i];
                int nextY = s.y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }
                if (visited[nextX][nextY] || map[nextX][nextY] != 0) {
                    continue;
                }
                q.add(new spot(nextX, nextY));
                map[nextX][nextY] = map[s.x][s.y] + 1;
                if (max < map[nextX][nextY]) {
                    max = map[nextX][nextY];
                }
                visited[nextX][nextY] = true;
            }
        }
    }
}
class spot{
    int x;
    int y;
    spot(int x, int  y){
        this.x = x;
        this.y = y;
    }
}