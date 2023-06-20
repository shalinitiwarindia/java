import java.util.Scanner;

public class BruteForce {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        String name = scanner.next();
        String str = name;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
            }
        }
    }
}
