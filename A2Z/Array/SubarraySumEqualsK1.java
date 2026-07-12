class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> count=new HashMap<Integer,Integer>();
        count.put(0,1);
        int sum=0,res=0;
        for(int num:nums){
            sum+=num;
            if(count.containsKey(sum-k)){
                res+=count.get(sum-k);
            }
            count.put(sum,count.getOrDefault(sum,0)+1);
        }
        return res;
    }
}