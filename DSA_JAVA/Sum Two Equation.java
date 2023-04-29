import java.util.Scanner;

public class SumTwoEquation {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a= sc.nextInt();
        int b= sc.nextInt();
       int X=(a*5)+(b*3);
       int Y=(a*7)+(b*4);
        System.out.println(X+Y);

    }
}
