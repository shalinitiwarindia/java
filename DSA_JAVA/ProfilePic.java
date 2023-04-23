import java.util.Scanner;
public class PicProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the l,w and length,width");
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        if(length>l && width>w){
            System.out.println("Upload");
        } else if (length<l) {
            System.out.println("Increase length");

        } else if (width<w) {
            System.out.println("Increase width");

        }

    }
}
