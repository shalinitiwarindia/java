import java.util.Scanner;
public class Circle {
    public static void main(String[]args){
      double PI=3.1415;
      Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double radius=scanner.nextDouble();
        double circumference=2*PI*radius;
        System.out.println("The Circumference of Circle is:"+circumference);


    }
}

