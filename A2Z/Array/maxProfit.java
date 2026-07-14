class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length,max=Integer.MIN_VALUE;
        int[] maxs=new int[len];
        for(int i=len-1;i>=0;i--){
            max=Math.max(max,prices[i]);
            maxs[i]=max;
        }
        int min=Integer.MAX_VALUE,res=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            min=Math.min(min,prices[i]);
            res=Math.max(res,maxs[i]-min);
        }
        return res;
    }
}