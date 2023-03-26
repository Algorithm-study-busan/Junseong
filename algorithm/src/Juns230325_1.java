import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Juns230325_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] info = a.split(" ");
        int N = Integer.parseInt(info[0]);
        int M = Integer.parseInt(info[1]);
        int[] list = new int[N+1];
        list[0] = 0;
        a = br.readLine();
        String[] num = a.split(" ");

        for (int i = 0; i < N; i++) {
            list[i+1] = list[i] + Integer.parseInt(num[i]);
        }

        for (int i = 0; i < M; i++) {
            a = br.readLine();
            String[] range = a.split(" ");
            System.out.println(list[Integer.parseInt(range[1])]-list[Integer.parseInt(range[0])-1]);
        }

    }
}
