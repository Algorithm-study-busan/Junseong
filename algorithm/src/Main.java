public class Main {
    public static void main(String[] args) {
        String a = "ASDFG";
        String[] result = a.split("");
        for (int i = 0; i < a.length(); i++) {
            System.out.println(result[i].equals("A"));
        }
    }
}