import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%4==0){
            System.out.println("Yes");

        }else{
            System.out.println("No");
        }
    }
}
