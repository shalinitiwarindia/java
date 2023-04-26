import java.util.Scanner;

public class Divisors {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int left=scanner.nextInt();
        int right= scanner.nextInt();
        int k= scanner.nextInt();
        int count=0;
        for(int i=left; i<=right; i++ ){
            if(i%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
