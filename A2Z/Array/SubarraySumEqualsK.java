class Solution {
    public int subarraySum(int[] nums, int k) {
        int res=0,len=nums.length;
        int[] sum=new int[len+1];
        sum[0]=0;
        for(int i=1;i<=len;i++){
            sum[i]=sum[i-1]+nums[i-1];
        }
        for(int s=0;s<len;s++){
            for(int e=s+1;e<=len;e++){
                if((sum[e]-sum[s])==k){
                    res++;
                }
            }
        }
        return res;
    }
}