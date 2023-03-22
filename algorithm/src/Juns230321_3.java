import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Juns230321_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());


            String room;

            if(N % H == 0) {
                room = String.valueOf(H);
                room += String.format("%02d", (N / H));
            }else {
                room = String.valueOf(N % H);
                room += String.format("%02d", (N / H) + 1);
            }
            System.out.println(room);
        }
    }

}