import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        divisible(n);

    }
    public static int divisible(int n){
        if(n%3==0){
            System.out.println("Divisible by 3");
        }else{
            System.out.println("Not divisible by 3");
        }
        return 0;
    }
}
