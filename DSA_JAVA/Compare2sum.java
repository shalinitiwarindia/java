import java.util.Scanner;
    public class ComparesTwoSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            int sum1=a+b;
            int sum2=d+e;
            if(sum1>c && sum2>f){
                System.out.println("True");
            }else{
                System.out.println("No");
            }
        }
    }
    
