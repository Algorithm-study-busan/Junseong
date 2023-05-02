import java.io.*;
import java.util.*;

public class Juns230424_1 {

    static int[][] count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        count = new int[41][2];
        count[0][0] = 1;
        count[0][1] = 0;
        count[1][0] = 0;
        count[1][1] = 1;
        for (int i = 2; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                count[i][j] = count[i-1][j] + count[i-2][j];
            }
        }
        int list[] = new int[K];
        for (int i = 0; i < K; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < K; i++) {
            System.out.println(count[list[i]][0] + " " + count[list[i]][1]);
        }
    }
}
