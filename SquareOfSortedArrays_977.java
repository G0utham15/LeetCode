public class SquareOfSortedArrays_977 {
    public int[] sortedSquares(int[] nums) {
        int[] squared=new int[nums.length];
        for(int i=0,j=nums.length-1,k=j;i<=j;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                squared[k]=(int)Math.pow(nums[i],2);
                i++;
            }else{
                squared[k]=(int)Math.pow(nums[j],2);
                j--;
            }
        }
        return squared;
    }
}
