class Solution {
    public void sortColors(int[] nums) {
        int left =0, right=nums.length-1,index=0;
        while(index<=right){
            if(nums[index]==2){
                int temp=nums[index];
                nums[index]=nums[right];
                nums[right--]=temp;
                continue;
            }
            else if(nums[index]==0){
                int temp=nums[left];
                nums[left++]=nums[index];
                nums[index]=temp;
            }
                index++;
        }
    }
}