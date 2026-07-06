class Solution {
    void recursiveBubbleSort(int n,int[] nums){
        if(n<=0){
            return;
        }
        boolean swapped=false;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                int temp=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=temp;
                swapped=true;
            }
        }
        if(!swapped){
            return;
        }
        recursiveBubbleSort(n-1,nums);
    }
    public int[] sortArray(int[] nums) {
        recursiveBubbleSort(nums.length,nums);
        return nums;
    }
}