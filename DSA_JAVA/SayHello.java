import java.util.Scanner;

public class SayHello {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name= sc.next();
        String a="Hello";
        System.out.println(a+" "+ name);
    }
}
