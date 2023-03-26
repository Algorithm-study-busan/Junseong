import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Juns230325_2 {
    public static boolean[][] chess;
    public static int min = 64;
    public static void count(int a, int b){
        int count = 0;

        boolean first = chess[a][b];

        for (int i = a; i < a+8; i++) {
            for (int j = b; j < b+8; j++) {
                if (chess[i][j] != first) {
                    count++;
                }

                first = !first;
            }
            first = !first;
        }

        count = Math.min(count, 64-count);

        min = Math.min(min, count);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] info = a.split(" ");
        int N = Integer.parseInt(info[0]);
        int M = Integer.parseInt(info[1]);

        chess = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str= br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    chess[i][j] = true;
                }
                else {
                    chess[i][j] = false;
                }
            }
        }

        for (int i = 0; i < N - 7; i++) {
            for (int j = 0; j < M - 7; j++) {
                count(i, j);
            }
        }
        System.out.println(min);

    }
}
