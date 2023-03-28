import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Juns230327_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]) max = arr[i];
        }

        int start = 0;
        int end = max;
        int mid = (end + start) / 2;
        int result = 0;
        while(end - start >= 0) {
            long sum = 0;
            for(int i = 0; i < N; i++) {
                if(arr[i] > mid) sum += (arr[i] - mid);
            }

            if(sum >= M) {
                start = mid + 1;
                result = mid;
            }else if(sum < M) {
                end = mid - 1;
            }
            mid = (end + start) / 2;
        }
        System.out.println(result);
    }

}