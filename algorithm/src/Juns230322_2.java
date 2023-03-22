import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Juns230322_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] card = new int[n];
        for (int i = 0; i < n; i++) {
            card[i] = i+1;
        }
        while (n!=1){

            for (int i = 0; i < n; i+=2) {
                card[i] = 0;
            }
            for (int i = 1; i < n; i+=2) {
                card[i/2] = card[i];
            }
            if (n%2==1){
                int k = card[0];
                for (int i = 0; i < n-1; i++) {
                    card[i] = card[i+1];
                }
                card[n/2-1] = k;
            }
            n = n/2;


        }
        System.out.println(card[0]);
    }
}
