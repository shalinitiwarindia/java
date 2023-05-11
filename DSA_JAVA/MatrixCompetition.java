import java.util.Scanner;

public class MatrixCompetition {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               A[i][j]= sc.nextInt();
            }
        }
        int k= sc.nextInt();
        int l= sc.nextInt();
        int[][] B = new int[k][l];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                B[i][j]= sc.nextInt();
            }
        }
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
             sum1=sum1+A[i][j];
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                sum2=sum2+B[i][j];
            }
        }
        if(sum1>sum2){
            System.out.println(sum1);
        }else{
            System.out.println(sum2);
        }

    }
}
