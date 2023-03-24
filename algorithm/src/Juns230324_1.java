import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Juns230324_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        String a = br.readLine();
        String[] num = a.split(" ");
        int N = Integer.parseInt(num[0]);
        int K = Integer.parseInt(num[1]);

        int[] money = new int[N];
        for (int i = 0; i < N; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (K < money[N-i-1]) {
                continue;
            }
            else if (K == money[N-i-1]) {
                count++;
                break;
            }
            else {

                count += K/money[N-i-1];
                K -= money[N-i-1] * (K/money[N-i-1]);

            }
        }
        System.out.println(count);
    }
}
