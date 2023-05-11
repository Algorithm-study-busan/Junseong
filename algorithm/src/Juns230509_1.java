import java.io.*;
import java.util.*;
public class Juns230509_1 {
    static char[][][] map;
    static boolean[][] visited;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int N;
    static int[] count = {0,0};
    static void countMap(int a, int b, int c) {
        visited[a][b] = true;
        for (int i = 0; i < 4; i++) {
            if(a+dx[i] < 0 || a+dx[i] >= N || b+dy[i] < 0 || b+dy[i] >= N) {
                continue;
            }
            if(map[a+dx[i]][b+dy[i]][c] == map[a][b][c] && !visited[a+dx[i]][b+dy[i]]) {
                countMap(a+dx[i], b+dy[i], c);
            }
        }
    }

    static void clearMap () {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                visited[i][j] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N][2];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                if (s.charAt(j) == 'R') {
                    map[i][j][0] = 'R';
                    map[i][j][1] = 'R';
                }
                else if (s.charAt(j) == 'G') {
                    map[i][j][0] = 'G';
                    map[i][j][1] = 'R';
                }
                else {
                    map[i][j][0] = 'B';
                    map[i][j][1] = 'B';
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            clearMap();
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(!visited[j][k]) {
                        countMap(j,k,i);
                        count[i]++;
                    }
                }
            }
        }
        System.out.println(count[0] +" " + count[1]);
    }
}
