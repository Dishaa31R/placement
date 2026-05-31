import java.util.*;

public class RotateImage{
    public static int[][] rotate(int[][] mat){
        int size=mat.length;
        for(int row=0;row<size;row++){
            for(int col=row+1;col<size;col++){
                mat[row][col]^=mat[col][row];
                mat[col][row]^=mat[row][col];
                mat[row][col]^=mat[col][row];
            }
        }
        for(int row=0;row<size;row++){
            int left=0,right=size-1;
            while(left<right){
                mat[row][left]^=mat[row][right];
                mat[row][right]^=mat[row][left];
                mat[row][left]^=mat[row][right];
                left++;
                right--;
            }
        }
        return mat;
    }
    public static void main(String args[]){
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString((rotate(mat))));
}
}