import java.util.Arrays;

public class SuccessfulPairsOfSpellsPotions_2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.parallelSort(potions);
        int potLen=potions.length;
        for(int i=0;i<potLen;i++){
            potions[i]= (int) Math.ceil((double) success /potions[i]);
        }
        System.out.println(Arrays.toString(potions));
        int[] res=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int start=0,end=potLen-1,target=spells[i],mid;
            while(start<=end){
                mid=start+(end-start)/2;
                if(target<potions[mid]){
                    start=mid+1;
                }else if(potions[mid] <= target){
                    end=mid-1;
                }
            }
            res[i]=potLen-start;
        }
        return res;
    }
}
