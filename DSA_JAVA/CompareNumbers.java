import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a>b && c>d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
