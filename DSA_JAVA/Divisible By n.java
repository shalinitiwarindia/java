import java.util.Scanner;

public class DivisibleByn {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        int k= sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%k==0){
                System.out.println(i);
            }

        }
    }
}
