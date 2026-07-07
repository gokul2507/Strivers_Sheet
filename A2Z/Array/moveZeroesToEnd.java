class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length,p=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[p++]=nums[i];
            }
        }
        while(p<n) nums[p++]=0;
    }
}