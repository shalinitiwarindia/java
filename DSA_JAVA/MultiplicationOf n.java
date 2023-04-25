import java.util.Scanner;

public class Multiplication {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        for(int n=1;n<=10;n++){
            System.out.println(num*n);
        }
    }
}
