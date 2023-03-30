public class MaximumSubArray_53 {
    public int maxSubArray(int[] nums) {
        int currMax=nums[0];
        int totalMax=nums[0];
        for(int i=1;i<nums.length;i++){
            currMax=Math.max(nums[i], nums[i]+currMax);
            if(totalMax<currMax){
                totalMax=currMax;
            }
        }
        return totalMax;
    }
}