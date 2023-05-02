import java.util.Scanner;

public class DotsAndDashes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String res = "";
            if (i % 2 == 0) {
                for (int j = 1; j <= n; j++) {
                    res += "*";
                }
                System.out.println(res);
            } else {
                System.out.println("-");
            }
        }
    }
}
