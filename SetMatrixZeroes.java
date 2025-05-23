import java.util.*;

public class SetMatrixZeroes {
    static ArrayList<ArrayList<Integer>> zeroMat(ArrayList<ArrayList<Integer>> mat, int n, int m){
        // int[] row = mat[..][0]
        //int[] col = mat[0][..]
        int col0=1;
        //step 1 : traverse mat and mark first row and col according to it
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat.get(i).get(j)==0){
                    mat.get(i).set(0, 0);
                    if(j!=0) mat.get(0).set(j, 0);
                    else col0=0;
                }
            }
        }
        //step 2: mark with 0 from 1,1 to n-1,m-1
        for(int i=1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(mat.get(i).get(j)!=0){
                    //check for col and row
                    if(mat.get(i).get(0)==0 || mat.get(0).get(j)==0){
                        mat.get(i).set(j, 0);
                    }
                }
            }
        }
        // step 3 : finally mark first col and then row 0
        if(mat.get(0).get(0) == 0){
            for(int j=0;j<m;j++){
                mat.get(0).set(j, 0);
            }
        }
        if(col0 == 0){
            for(int i=0;i<n;i++){
                mat.get(0).set(0, 0);
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        mat.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        mat.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = mat.size();
        int m = mat.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMat(mat, n, m);

        System.out.println("The Final mat is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
