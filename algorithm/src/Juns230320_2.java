import java.util.Scanner;
public class Juns230320_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=1;
        while (true){
            k = sc.nextInt();
            if (k==0){
                break;
            }
            String a = String.valueOf(k);
            String[] b = a.split("");
            String ans="yes";
            for (int i = 0; i < a.length() / 2; i++) {
                if(b[i].equals(b[a.length()-i-1])){
                    continue;
                }
                else{
                    ans = "no";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
