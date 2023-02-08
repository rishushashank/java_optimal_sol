import java.util.*;

public class Merge_overlap {
    static void merge(interval cord[]){
       if(cord.length <=0){
        return;
       }
       Stack<interval> st = new Stack<>();


       Arrays.sort(cord,new Comparator<interval>(){
        public int compare(interval i1,interval i2){
            return i1.start - i2.start;
        }
       });

       st.push(cord[0]);
       for(int i=1;i<cord.length;i++){
        interval top = st.peek();

        if(top.end < cord[i].start){
            st.push(cord[i]);
        }

        else if(top.end < cord[i].end){
            top.end = cord[i].end;
            st.pop();
            st.push(top);
        }

       }
       while(!st.isEmpty()){
            interval t = st.pop();
            System.out.println(t.start+" "+t.end);
       }


    }
    public static void main(String[] args){
        interval arr[] = new interval[4];
        arr[0] =new interval(6,8);
        arr[1] =new interval(1,9);
        arr[2] =new interval(2,4);
        arr[3] =new interval(4,7);

        merge(arr);

    }

}

class interval{
    int start,end;
    interval(int start,int end){
        this.start = start;
        this.end = end;
    }
}
