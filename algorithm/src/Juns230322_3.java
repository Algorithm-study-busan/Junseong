import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Juns230322_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        for (int i = 1; i < N; i++) {
            int k = i+1;
            while (true){
                if(k%2==0){
                    k = k/2;
                    a++;
                }
                else if(k%5==0){
                    k = k/5;
                    b++;
                }
                else {
                    break;
                }
            }
        }
        int ans;
        if (a>b) {
            ans = b;
        }
        else {
            ans = a;
        }
        System.out.println(ans);


    }
}
