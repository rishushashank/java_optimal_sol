public class sort012_2 {
    static void sort1(int arr[]){
        // Greedy approach using merge sort having time complexity O(nlogn);
    }
    static void sort2(int arr[]){
        // optimal approach using count variable having time complexity O(2N);
        int c0=0,c1=0,c2=0;
        for(int i : arr){
            if(i == 0){
                c0++;
            }else if(i == 1){
                c1++;
            }else if(i == 2){
                c2++;
            }
        }
        int j=0;
        for(int i=0;i<c0;i++){
            arr[j++] = 0;
        }
       
        for(int i=0;i<c1;i++){
            arr[j++] = 1;
        }
        
        for(int i=0;i<c2;i++){
            arr[j++] = 2;
        }
        
    }

    // best optimal using three variabel low,mid,high having timr complexity O(n);
    //our intution is that  mid left only 0 and mid right only 2
    static void sort3(int arr[]){
        int low=0,mid=0,high=arr.length-1;
        while(mid<= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
                continue;
            }
            else if(arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {0,0,1,0,1,0,0,1};
        
        // sort2(arr);
        // for(int i : arr)
        // System.out.print(i);
        // System.out.println();

        sort3(arr);
        for(int i: arr){
            System.out.print(i);
        }
        
        

    }
}
