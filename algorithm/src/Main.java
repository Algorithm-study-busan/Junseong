import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        String s = "[1, 2, 3, 4]";
        String[] a = s.replaceAll("[^\\d]","").split("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println(a.length);
    }
}