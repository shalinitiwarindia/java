public class IntersactionOfArray {
    public static void main(String[] args){
        int[]arr1={2,5,7,6,4};
        int[]arr2={1,3,4,0,1};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j< arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
