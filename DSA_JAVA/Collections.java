import java.util.ArrayList;

public class Collections {
    public static void main(String  []args){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.remove(3);
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
