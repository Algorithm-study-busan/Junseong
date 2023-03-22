import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Juns230322_1 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] list = new String[N];
        for (int i = 0; i < N; i++) {
            list[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            int a = 0;
            int b = 0;
            String ans = "YES";
            if (list[i].charAt(0) == ')' || list[i].charAt(list[i].length()-1) == '('){
                ans = "NO";
            }
            else {
                for (int j = 0; j < list[i].length(); j++) {
                    if(list[i].charAt(j)=='('){
                        a++;
                    }
                    else {
                        b++;
                    }
                    if (a<b){
                        ans = "NO";
                        break;
                    }
                }
            }
            if (a != b){
                ans = "NO";
            }
            System.out.println(ans);

        }

    }
}
