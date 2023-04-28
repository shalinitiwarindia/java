import java.util.Scanner;

public class ReverseL {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=scanner.nextInt();
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(i==n-1 || j==n-1){
                    System.out.println("*");
                }else System.out.println("  ");
            }
            System.out.println();
        }
    }
}
