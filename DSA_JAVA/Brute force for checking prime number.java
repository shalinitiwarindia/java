public class BruteForce {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int cnt=0;
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
           if(cnt==2){
               System.out.println("The number is prime");
           }else{
               System.out.println("Not prime");
           }
        }
    }
