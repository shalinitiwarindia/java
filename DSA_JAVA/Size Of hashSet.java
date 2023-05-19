import java.util.*;

public class SetTestDrive {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("BMW");
        hashSet.add("Volvo");
        hashSet.add("Kia");
        hashSet.add("Renault");
        hashSet.add("BMW");
        System.out.println(hashSet.size());
    }
}
