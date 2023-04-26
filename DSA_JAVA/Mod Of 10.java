import java.util.Scanner;

public class ModOf10 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i%10);
        }
    }
}
