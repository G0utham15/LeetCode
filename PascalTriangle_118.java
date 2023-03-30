import java.util.ArrayList;
import java.util.List;

public class PascalTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> innerRes;
        for (int i = 0; i < numRows; i++) {
            innerRes=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    innerRes.add(j,1);
                    continue;
                }
                innerRes.add(j,res.get(i-1).get(j)+res.get(i-1).get(j-1));
            }
            res.add(i,innerRes);
        }
        return res;
    }
}
