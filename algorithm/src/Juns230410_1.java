import java.io.*;
import java.util.*;
public class Juns230410_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int K = Integer.parseInt(a[0]);
        int N = Integer.parseInt(a[1]);

        int[] arr = new int[K];

        long max = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        max ++;

        long min = 0;
        long mid = 0;

        while (min < max)   {
            mid = (max+min) / 2;
            long count = 0;
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i]/mid);
            }
            if (count<N) {
                max = mid;
            }
            else {
                min = mid +1;
            }
        }
        System.out.println(min-1);

    }
}
