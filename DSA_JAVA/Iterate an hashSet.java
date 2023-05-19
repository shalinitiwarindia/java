import java.util.HashSet;

public class TestDrive {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("BMW");
        hashSet.add("Volvo");
        hashSet.add("Kia");
        hashSet.add("Renault");

        for (String car : hashSet){
            System.out.println(car);
        }
    }
}
