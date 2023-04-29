import java.util.Scanner;

public class FirstPatterns {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for pattern");
        int n= sc.nextInt();
        String a="*";
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n;j++){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
