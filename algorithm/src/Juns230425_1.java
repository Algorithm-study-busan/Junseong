import java.io.*;
public class Juns230425_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s  = br.readLine();
        String[] sub = s.split("-");

        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < sub.length; i++) {
            int k = 0;

            String[] add = sub[i].split("\\+");
            for (int j = 0; j < add.length; j++) {
                k += Integer.parseInt(add[j]);
            }
            if (sum == Integer.MAX_VALUE) {
                sum = k;
            }
            else {
                sum -=k;
            }
        }
        System.out.println(sum);


    }
}
