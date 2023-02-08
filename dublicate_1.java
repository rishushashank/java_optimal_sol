import java.util.HashMap;

public class dublicate_1{

     // greedy approach
    static int dublicate1(int arr[]){
        int ans = 0;
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i == j){
                    continue;
                }
                if(arr[i] == arr[j]){
                    ans= arr[i];
                }
            }
        }
        return ans;
        //O(n^2)- time complexity
    }

    // Optimal using hashing
    static int dublicate2(int arr[]){
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.get(i) == 2){
                ans = i;
            }
        }
        return ans;
        //O(n)- time complexity + O(n)-space complexity
    }


    //Best Optimal solution using Cycle detection method
    static int dublicate3(int arr[]){
        int ans = 0,slow=0,fast=0;
        while(slow != fast){
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        
        return slow;
        //O(n)- time complexity + O(n)-space complexity
    }

    public static void main(String [] args){
        int arr[] = {5,1,2,3,4,2};
        System.out.println(dublicate1(arr));
        System.out.println(dublicate2(arr));
        System.out.println(dublicate3(arr));
    }
}