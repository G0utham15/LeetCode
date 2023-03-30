public class ReshapeMatrix_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c) return mat;

        int[][] res=new int[r][c];
        int row=0,col=0;
        for(int[] i:mat){
            for(int j:i){
                res[row][col]=j;
                col++;
                if(col>=c){
                    col%=c;
                    row++;
                }
            }
        }
        return res;
    }
}
