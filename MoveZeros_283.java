public class MoveZeros_283 {
    /* Using Swapping 
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && i<nums.length-1){
                j=i+1;
                if(j>=nums.length) return;
                while(nums[j]==0){
                    j++;
                    if(j>=nums.length) return;
                }
                swap(nums, j, i);
            }
                
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    */

    public void moveZeroes(int[] nums) {
        if(nums.length<=1) return;
        int temp=0;
        for(int i:nums){
            if(i!=0){
                nums[temp++]=i;
            }
        }
        while(temp<nums.length){
            nums[temp++]=0;
        }
        //System.gc();
    }
}
