import java.util.Scanner;
public class Ashes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the scores");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String Australia="a";
        String England="b";
        if(a>b){
            System.out.println("Australia");
        } else if (a==b) {
            System.out.println("Tie");
        }else{
            System.out.println("England");
        }
    }
}

