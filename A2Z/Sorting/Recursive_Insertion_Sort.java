class Solution {
    void recursivInsertionSort(int i,int n,int[] nums){
        if(i>=n){
            return;
        }
        int num=nums[i],j=i-1;
        for(;j>=0 && nums[j]>num;j--){
            nums[j+1]=nums[j];
        }
        nums[j+1]=num;
        recursivInsertionSort(i+1,n,nums);
    }
    public int[] sortArray(int[] nums) {
        recursivInsertionSort(0,nums.length,nums);
        return nums;
    }
}