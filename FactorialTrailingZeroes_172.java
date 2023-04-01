import java.util.Arrays;

public class FactorialTrailingZeroes_172 {
    public int trailingZeroes(int n) {
        int res=0, pow=1;
        while(n/Math.pow(5,pow)>0){
            res+=n/Math.pow(5,pow);
            pow++;
        }
        return res;
    }
}
