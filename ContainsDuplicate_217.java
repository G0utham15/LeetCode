import java.util.HashSet;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> freq=new HashSet<>(nums.length);
        for(int i:nums){
            if(!freq.add(i)) return true;
        }
        return false;
    }
}