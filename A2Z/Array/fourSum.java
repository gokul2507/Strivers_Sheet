class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        long t=(long)target;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            for(int j=i+1;j<len;j++){
                Map<Long,Long> remaining = new HashMap<>();
                for(int o=j+1;o<len;o++){
                    Long k=t-nums[i]-nums[j]-nums[o];
                    if(remaining.getOrDefault(k,0l)>0l){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(target-nums[i]-nums[j]-nums[o]);
                        temp.add(nums[o]);
                        res.add(temp);
                        // System.out.println(i+" "+j+" "+o+" "+k);
                        remaining.put(k,remaining.get(k)-1);
                        while(o+1<len && nums[o]==nums[o+1])o++;
                    }
                    else{
                        remaining.put((long)nums[o],remaining.getOrDefault(nums[o],0l)+1l);
                    }
                }
                while(j+1<len && nums[j]==nums[j+1])j++;
            }
        }
        return res;
    }
}
// -2, -1, 0, 0, 1, 2