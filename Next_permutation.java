import java.util.Arrays;
public class Next_permutation {
    public static String nextPermutation(String str){
        
        String ans = "";
        char ch[] = str.toCharArray();
        int n = ch.length;
        //System.out.print(n);
        int i=0,j=0;
        for(i=n-2;i>=0;i--){
            if(ch[i] < ch[i+1]){
                break;
            }
            //System.out.println(i+" "+j);
        }
        if(i <0 ){
            return "-1";
        }
       // System.out.println("hahahaha");
        for(j=n-1;j>=0;j--){
            if(ch[j] > ch[i]){
                break;
            }
           // System.out.println(i+" "+j);
        }
        
        //System.out.print(i+" "+j);
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        Arrays.sort(ch,i+1,n); 
        for(char c:ch)
        ans +=c;
        
        return ans;
    }
    public static void main(String[] args){
        String str = "abeda";
        System.out.print(nextPermutation(str));
    }
}
