class TwoSum_1{
    public int[] twoSum(int[] nums, int target) {
        int[] res={-1,-1};
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[j]==target-nums[i]){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
}