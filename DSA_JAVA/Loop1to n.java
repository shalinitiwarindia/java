import java.util.Scanner;

public class Loops1 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }

    }
}
