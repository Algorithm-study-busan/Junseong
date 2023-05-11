import java.io.*;
import java.util.*;

public class Juns230511_1 {
    static int N;
    static boolean[][] map;
    static LinkedList<Integer>[] edges;
    static boolean[] list;
    static void clear() {
        for (int i = 0; i < N; i++) {
            list[i] = false;
        }
    }
    static void checkMap(int a){
        for (int i = 0; i < N; i++) {
            if(list[i]) {
                map[a][i] = true;
            }
            else {
                map[a][i] = false;
            }
        }
    }

    static void dfs (int a) {
        for(int next : edges[a]){
            if(!list[next]) {
                list[next] = true;
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new boolean[N][N];
        edges = new LinkedList[N];
        list = new boolean[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new LinkedList<Integer>();
        }
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                if(s[j].equals("1")) {
                    edges[i].add(j);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            clear();
            dfs(i);
            checkMap(i);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j]) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
