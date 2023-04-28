import java.util.Scanner;

public class Patterns {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter left and right number:");
        int left= sc.nextInt();
        int right= sc.nextInt();
        for(int i=1; i<=left; i++){
            for(int j=1; j<=right; j++){
                System.out.println(i+"."+j);
            }
        }
    }
}
