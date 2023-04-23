import java.util.Scanner;
public class CompareSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 7 number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int sum1=(a+b)*c;
        int sum2=d+e+f+g;
        if(sum1>sum2){
            System.out.println("True");

        }else{
            System.out.println("False");
        }

    }
}
