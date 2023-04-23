import java.util.Scanner;
public class PrintGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int total = scanner.nextInt();
        if(total==100){
            System.out.println("A");
        } else if (total>=90) {
            System.out.println("B");
            
        } else if (total>=80) {
            System.out.println("C");
            
        }else{
            System.out.println("F");
        }
    }
}

