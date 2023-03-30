import java.util.Arrays;

public class SortArray_912 {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
    public void sort(int[] nums,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            sort(nums, start,mid);
            sort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }

    public void merge(int[] nums,int left, int mid,int right){

        int k=left;
        int[] Li= Arrays.copyOfRange(nums,left,mid+1),Ri=Arrays.copyOfRange(nums,mid+1,right+1);
        int i=0,j=0;
        while(i<Li.length&&j<Ri.length){
            if(Li[i]>Ri[j]){
                nums[k++]=Ri[j++];
            }else{
                nums[k++]=Li[i++];
            }
        }
        if(i==Li.length){
            while(j<Ri.length){
                nums[k++]=Ri[j++];
            }
        }else if(j==Ri.length){
            while(i<Li.length){
                nums[k++]=Li[i++];
            }
        }
    }

    public static void main(String[] args) {
        SortArray_912 temp=new SortArray_912();
        int[] arr={15,10,10,5,7,9,35,6};
        temp.sortArray(arr);
        for (int i:
                arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
