class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            int k=-nums[i];
            Map<Integer,Integer> remaining = new HashMap<>();
            for(int j=i+1;j<len;j++){
                if(remaining.getOrDefault(k-nums[j],0)>0){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(k-nums[j]);
                    temp.add(nums[j]);
                    res.add(temp);
                    remaining.put(k-nums[j],remaining.get(k-nums[j])-1);
                    while(j+1<len && nums[j]==nums[j+1])j++;
                }
                else{
                    remaining.put(nums[j],remaining.getOrDefault(nums[j],0)+1);
                }
            }
        }
        return res;
    }
}