import java.util.Scanner;

public class FizzzBuzzz {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= sc.nextInt();
        for(int i=1; i<num; i++) {
            System.out.println(i + "\t");
        }
            if(num%3==0 && num%5==0){
                System.out.println("FizzBuzz");
            } else if (num%3==0) {
                System.out.println("Fizz");

            } else if (num%5==0) {
                System.out.println("Buzz");

            }else {
                System.out.println(num);
            }
        }
    }
