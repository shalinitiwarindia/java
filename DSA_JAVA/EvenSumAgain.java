import java.util.Scanner;

public class EvenSumAgain {
    public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:");
            int num= sc.nextInt();
            int count=0;
            for(int n=1;n<=num;n++){
                if(n %2 == 0){
                    count+=n;
                }
                    System.out.println(count);
            }
    }
}
