import java.util.Arrays;
public class set_matrix_zero {

    //greedy Approach
    public static void setzero1(int mat[][]){
        int ans[][] = new int[mat.length][mat[0].length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
        int x = 0;
        int y=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                if(mat[i][j] == 0){
                    x = i;
                    y = j;
                    for(int a=0;a<ans[0].length;a++){
                        ans[x][a] = 0;
                    }
                    for(int a=0;a<ans.length;a++){
                        ans[a][y] = 0;
                    }
                }
                
            }
        }
        System.out.println();
        int c=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }



    }

    //optimal Approach using two single array row and col;
    public static void setzero2(int mat[][]){
        int row[] = new int[mat.length];
        Arrays.fill(row,1);
        
        int col[] = new int[mat[0].length];
        Arrays.fill(col,1);

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    int x = i;
                    int y = j;
                    row[x]=0;
                    col[y]=0;
                }
            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(row[i]==0 || col[j]==0)
                mat[i][j] = 0;
            }
        }

    }

    public static void main(String[] args){
        int ans[][] = {{1,1,1,0},{1,1,1,1},{1,1,1,1}};
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
        setzero2(ans);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }
}
