import java.util.Scanner;

public class LogicalAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>15 && b>20){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
