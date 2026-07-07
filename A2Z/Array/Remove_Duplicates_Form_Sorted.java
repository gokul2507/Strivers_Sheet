class Solution {
    public int removeDuplicates(int[] nums) {
        int ind=1,n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[ind-1]!=nums[i]){
                nums[ind++]=nums[i];
            }
        }
        return ind;
    }
}