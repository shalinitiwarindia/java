import java.util.Scanner;

public class BruteForce {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        String name = scanner.next();
        String str = name;
        for (int i =0; i <str.length(); i=i+2) {
            System.out.println(str.charAt(i));

        }
    }
}
