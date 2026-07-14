class Solution {
    public int maxSubArray(int[] nums) {
        int max=0,res=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(num,max+num);
            res=Math.max(res,max);
        }
        return res;
    }
}