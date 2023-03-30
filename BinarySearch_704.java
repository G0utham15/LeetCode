public class BinarySearch_704 {
    public int search(int[] nums, int target) {
        if(target<nums[0]||target>nums[nums.length-1]) return -1;
        int start=0,end=nums.length-1,mid;
        while(true){
            mid= (int) (start + end)/2;
            if (nums[mid]==target){
                return mid;
            }
            if(start==end && nums[mid]!=target){
                return -1;
            }
            if(target>nums[mid]){
                start=mid+1;
                continue;
            }else if(target<nums[mid]){
                end=mid-1;
                continue;
            }

        }
    }
}
