public class BruteForce {
    public static void main(String[] args){
        int[]arr={2,5,7,6,4};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==11){
                    count++;
                }
            }
        }
        System.out.println("The count of pair for 11: "+count);
    }
}
