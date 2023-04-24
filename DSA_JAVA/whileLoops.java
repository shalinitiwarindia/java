//programm for printing even number from 43 to 67
public class LoopWhile {
    public static void main(String[] args) {
        int i = 43;
        while (i <=67) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
