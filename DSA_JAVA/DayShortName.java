import java.util.Scanner;
public class DayShortName {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week :");
        String day= sc.next();
        if(day.equals("Monday")){
            System.out.println("Mon");
        } else if (day.equals("Tuesday")) {
            System.out.println("Tue");


        }else if (day.equals("Wednesday")) {
            System.out.println("Wed");


        }else if (day.equals("Thursday")) {
            System.out.println("Thurs");


        }
        else if (day.equals("Friday")) {
            System.out.println("Fri");


        }
        else if (day.equals("Saturday")) {
            System.out.println("Sat");


        }
        else if (day.equals("Sunday")) {
            System.out.println("Sun");


        }else{
            System.out.println("Invalid day");
        }

    }
}
