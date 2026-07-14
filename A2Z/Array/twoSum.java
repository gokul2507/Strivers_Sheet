class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> count = new HashMap<Integer,Integer>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            int num=nums[i];
            if(count.containsKey(target-num)){
                return new int[]{count.get(target-num),i};
            }
            count.put(num,i);
        }
        return null;
    }
}