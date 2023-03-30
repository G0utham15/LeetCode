import java.util.Arrays;

public class ValidSudoku_36 {
    public boolean isValidSudoku(char[][] board) {
        // Check row wise
        for (char[] i:board) {
            if(containsDuplicates(i)){
                return false;
            }
        }
        // Check Column wise
        char[] arr=new char[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[j]=board[j][i];
            }
            if(containsDuplicates(arr)){
                return false;
            }
        }
        // Check in the 3*3 sub matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.arraycopy(Arrays.copyOfRange(board[3*i],3*j,3*j+3),0,arr,0,3);
                System.arraycopy(Arrays.copyOfRange(board[3*i+1],3*j,3*j+3),0,arr,3,3);
                System.arraycopy(Arrays.copyOfRange(board[3*i+2],3*j,3*j+3),0,arr,6,3);
                //System.out.println(Arrays.toString(arr));
                if(containsDuplicates(arr)){
                    return false;
                }
            }
        }
        return true;
    }

    boolean containsDuplicates(char[] arr){
        int[] freq={0,0,0,0,0,0,0,0,0};
        for(char i:arr){
            if(i=='.'){
                continue;
            }
            if(freq[i-'1']!=0) return true;
            freq[i-'1']=1;
        }
        return false;
    }

}
