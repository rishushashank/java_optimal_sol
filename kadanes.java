public class kadanes {
    // longest subarray having max sum ;
    //1. greedy approach using two for loop;
    //2. optimal way 
    public static void main(String[] args){
        int arr[] = {1,3,4,5,-3,2};
        int s=0,m=0;
        for(int i=0;i<arr.length;i++){
            s = Math.max(arr[i],s+arr[i]);
            m = Math.max(s,m);
        }
        System.out.println(m);
    }
}
