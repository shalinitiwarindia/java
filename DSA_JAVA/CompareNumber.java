import java.util.Scanner;
public class CompareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 2 number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a<b){
            System.out.println("True");
        }if(a>b) {
            System.out.println("False");

        }if(a==b){
            System.out.println("True");
        }
    }
}

