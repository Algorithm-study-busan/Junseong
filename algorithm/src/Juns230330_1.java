import java.io.*;
import java.util.*;
public class Juns230330_1 {
    static boolean[][] map;
    static int count;
    static int M;
    static int N;
    static int K;

    public static void find(int a, int b) {
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        if (map[a][b]){
            for (int i = 0; i < 4; i++) {
                if (a+dx[i]<0 || a+dx[i] >=M || b+dy[i]<0 ||b+dy[i]>=N) {
                    continue;
                }
                map[a][b] = false;
                if (map[a+dx[i]][b+dy[i]]){
                    find(a+dx[i], b+dy[i]);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[M][N];

            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    map[j][k] = false;
                }
            }
            for (int j = 0; j < K; j++) {
                String a = br.readLine();
                String[] b = a.split(" ");
                map[Integer.parseInt(b[0])][Integer.parseInt(b[1])] = true;
            }
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if(map[j][k]){
                        count++;
                        find(j,k);
                    }
                }
            }
            System.out.println(count);
        }


    }
}
