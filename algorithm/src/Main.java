import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        int a=1;
        if (true){
            a = 3;
        }
        System.out.println(a);
    }
}