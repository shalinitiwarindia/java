import java.util.Scanner;

public class WeekDay {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int newNum = num % 10;
        if(newNum==0){
            System.out.println("zero");
        }else if(newNum==1){
            System.out.println("one");
        }else if(newNum==2){
            System.out.println("two");
        }else if(newNum==4){
            System.out.println("three");
        }else if(newNum==5){
            System.out.println("four");
        }else if(newNum==6){
            System.out.println("five");
        }else if(newNum==7){
            System.out.println("six");
        }else if(newNum==8){
            System.out.println("seven");
        }else if(newNum==9) {
            System.out.println("nine");
        }
    }

}
