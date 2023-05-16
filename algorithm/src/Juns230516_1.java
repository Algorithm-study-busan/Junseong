import java.io.*;

public class Juns230516_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = 666;
        int count = 1;
        while (count != N) {
            M++;
            if (String.valueOf(M).contains("666")) {
                count ++;
            }

        }

        System.out.println(M);

    }
}
