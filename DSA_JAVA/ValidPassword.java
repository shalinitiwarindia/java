import java.util.Scanner;
public class Passwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st password :");
        int a = sc.nextInt();//only integer number will be accepted
        System.out.println("Enter 2nd password");
        int b = sc.nextInt();//only integer number will be accepted
        if(a==b){
            System.out.println("Password is valid");
        }else{
            System.out.println("Try again");
        }
    }
}

