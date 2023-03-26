import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Juns230326_1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[102];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        for (int i = 0; i < N; i++) {
            int Pn = Integer.parseInt(br.readLine());
            if (Pn<=5) {
                System.out.println(dp[Pn]);
            }
            else {
                for (int j = 0; j < Pn-5; j++) {
                    dp[6+j] = dp[1+j] + dp[5+j];
                }
                System.out.println(dp[Pn]);
            }
        }

    }
}
