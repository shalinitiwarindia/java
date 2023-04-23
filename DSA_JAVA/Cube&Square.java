import java.util.Scanner;

public class CubeAndSquare {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num,m,n;
        num=scanner.nextInt();
        m=num*num;
        n=num*num*num;
        if(m>n){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
