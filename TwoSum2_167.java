import java.util.HashMap;

public class TwoSum2_167 {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length==2) return new int[]{1,2};
        HashMap<Integer, Integer> dict=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(dict.putIfAbsent(numbers[i], i)!=null){
                if(target==numbers[i]*2){
                    return new int[]{dict.get(numbers[i])+1,i+1};
                }
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(dict.get(target-numbers[i])!=null){
                return new int[]{i+1,dict.get(target-numbers[i])+1};
            }
        }
        return new int[]{-1,-1};
    }
}
