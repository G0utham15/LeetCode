class Solution {
    public int maxProfit(int[] prices) {
        int maxProf=0, minVal=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>minVal){
                minVal=prices[i];
            }else if(maxProf<i-minVal){
                maxProf=i-minVal;
            }
        }
        return maxProf;
    }
}