import java.util.Scanner;

public class Vowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        System.out.println("Enter the array element");
        String[] words=new String[n];

        for(int i=0; i<n; i++){
           words[i]= sc.next();
        }
        int vowels=0;
        for(int i=0; i<n; i++){
            for(int j=0; j< words[i].length();j++){
                if(words[i].charAt(j)=='a' || words[i].charAt(j)=='A'||
                        words[i].charAt(j)=='e' || words[i].charAt(j)=='E'||
                        words[i].charAt(j)=='i' || words[i].charAt(j)=='I'||
                        words[i].charAt(j)=='o' || words[i].charAt(j)=='O'||
                        words[i].charAt(j)=='u' || words[i].charAt(j)=='U'){
                    vowels++;
                }

            }
        }
        System.out.println("The count of vowels are "+vowels);
    }
}
