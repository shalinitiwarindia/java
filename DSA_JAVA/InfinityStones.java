import java.util.Scanner;
public class InfinityStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int result=a+b*2+c*3+d*3+e*2+f*2;
        System.out.println(result);
    }
}
