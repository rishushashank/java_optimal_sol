import java.util.Arrays;;
public class Repeat_missing {

    //greddy using n+1 array having time complexity O(n) and O(n+1) soace complexity;
    static void find1(int arr[]){
        int temp[] = new int[arr.length+1];
        Arrays.fill(temp,0);
        int mis=0;
        int dub=0;
        for(int i:arr){
            temp[i]++;
        }
        for(int i=0;i<temp.length;i++){
            if(temp[i] == 0){
                mis = i;
            }
            else if(temp[i] == 2){
                dub = i;
            }
        }
        System.out.print(mis+" "+dub);
        
    }


    // optimal solution using sum formula;
    static void find2(int[] arr){
        int n=arr.length;
        int s0 = n * (n+1)/2;
        int s1=0;
        for(int i:arr){
            s1+=i;
        }
        int c1 = s0-s1;
        System.out.println(c1);
        s1 =0;
        s0 = (n *(n+1)*((2*n)+1))/6;
        for(int i:arr){
            s1+=i*i;
        }
        int c2 = s0-s1;
        System.out.println(c2);


        int c3 = c2/c1;//(mis+dub)
        System.out.println(c3);

        int mis = (c1+c3)/2;
        int dub = c3-mis;
        System.out.print(mis+" "+dub);

    }
    public static void main(String[] args){
        int arr[] = {3,1,3};
        find2(arr);
        
    }
}
