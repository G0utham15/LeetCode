import java.util.Arrays;

public class Search2DArray_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix[0][0]>target) return false;
        int i;
        for (i = 0; i < matrix.length-1; i++) {
            if(matrix[i][0]<=target&&matrix[i+1][0]>target) {
                return Arrays.binarySearch(matrix[i], target) >= 0;
            }
        }
        if(i==matrix.length-1){
            return Arrays.binarySearch(matrix[i], target) >= 0;
        }
        return false;
    }
}
