import java.util.Scanner;
public class NumSandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int myNum =sc.nextInt();
        if(myNum>=6 && myNum<=10){
            System.out.println("Number is between 6 and 10");
        }
        if(myNum>5){
            System.out.println("Greater than 5");
        }
        if(myNum<=12){
            System.out.println("the number is less than or equal to 12");
        }
        if(myNum%7==0){
            System.out.println("Number is divisible by 7");
        }
    }
}
