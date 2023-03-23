import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Juns230323_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String a = br.readLine();
        String[] b = a.split(" ");
        int[] time = new int[N];
        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(b[i]);
        }
        Arrays.sort(time);
        int min = 0;
        for (int i = 0; i < N; i++) {
            min += time[i] * (N-i);
        }
        System.out.println(min);

    }
}
