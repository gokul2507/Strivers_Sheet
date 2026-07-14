class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, majarity=nums[0];
        for(int num:nums){
            if(count==0){
                majarity=num;
            }
            if(majarity==num) count++;
            else count--;
        }
        return majarity;
    }
}