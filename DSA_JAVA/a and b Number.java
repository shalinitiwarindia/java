public class Masai {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        if (a > 5) {

            if (b > 5) {
                System.out.println("a>5 , b>5");
            } else {
                System.out.println("a>5 , b<5");
            }
        } else {
            if (b > 5) {
                System.out.println("a<5 , b>5");
            } else {
                System.out.println("a<5 , b<5");
            }
        }
    }
}
