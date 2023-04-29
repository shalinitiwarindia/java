import java.util.Scanner;

public class PowerOf4 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        a=a*a*a*a;
        System.out.println(a);
    }
}
