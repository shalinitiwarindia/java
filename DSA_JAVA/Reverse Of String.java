import java.util.Scanner;

public class BruteForce{
    public static void main(String args[]) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        String name =scanner.next();
        String str = name;
        for(int i=n-1; i>=0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
