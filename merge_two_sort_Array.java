public class merge_two_sort_Array {
    // best Optimal way using GAP VARIABLE HAVING ONLY o(N) TIME COMPLEXITY
    // void merge3(int arr1[],int arr2[]){
    //     int n=arr1.length;
    //     int m = arr2.length;
    //     int g = (n+m)/2;
    //     if((n+m) % 2!= 0){
    //         g++;
    //     }
    //     int h=0,t = h+g;
    //     int f=0;
    //     for(int i=0;i<n;i++){
    //         if(t>n && f==0){
    //             t = t%n;
    //             f=1;
    //         }else if(t>m && f==1){
    //             t = t%m;
    //             f=0;
    //         }
    //         if(arr1[h]>arr1[t]){

    //         }

    //     }
    // }
    // optimal solution having time complexity O(n+m) ans space complexity O(1);
    static void merge2 (int arr1[],int arr2[]){
        int n=arr1.length;
        int m = arr2.length;
        for(int i=0;i<n;i++){
            if(arr1[i]>arr2[0]){
                int temp = arr2[0];
                arr2[0] = arr1[i];
                arr1[i] = temp;
                for(int j=0;i<m-1;j++){
                    if(arr2[j]>arr2[j+1]){
                        temp = arr2[j+1];
                        arr2[j+1] = arr2[j];
                        arr2[j] = temp;
                    }else{
                        break;
                    }
                }
            }
            else{
                continue;
            }
        }
    }

    // without using any sort buildin function havinf O(M+N) time complexity ans O(m+n) space complexity;
    static int[] merge(int arr1[],int arr2[]){
        int ans[] = new int[arr1.length + arr2.length];
        int i=0;int j=0;
        for(int k=0;k<ans.length;k++){
            if(i<arr1.length || j<arr1.length){
                if(arr1[i] < arr2[j] ){
                    ans[k] = arr1[i];
                    i++;
                }
                else{
                    ans[k] = arr2[j];
                    j++;
                }
            }
            else if(arr1.length<arr2.length){
                ans[k] = arr2[j];
                j++;
                if(j == arr2.length){
                    break;
                }
            }else{
                ans[k] = arr1[i];
                    i++;
                    if(i == arr1.length){
                        break;
                    }
            }
            
        }
        return ans;
    }

    
    public static void main(String[] args){
        int arr1[] = {2,3,4,6,9,12};
        int arr2[] = { 1,5,7,8,10,11,14};
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arr2){
            System.out.print(i+" ");
        }
        System.out.println();
        merge2(arr1, arr2);
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arr2){
            System.out.print(i+" ");
        }

       int ans[] =  merge(arr1,arr2);
       for(int i: ans){
        System.out.print(i+" ");
       }
    }
}
