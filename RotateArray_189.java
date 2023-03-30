import java.util.Arrays;

public class RotateArray_189 {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if(k==0) return;
        int[] res=new int[nums.length];
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            res[j]=nums[i];
            j++;
        }
        for(int i=0;i< nums.length-k;i++){
            res[j]=nums[i];
            j++;
        }
        System.arraycopy(res, 0, nums, 0, res.length);

        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(res));
    }
}
