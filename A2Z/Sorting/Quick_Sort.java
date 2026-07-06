class Solution {
    void quickSort(int left, int right, int[] nums){
        if(left>=right)
            return;
        int pivot=nums[left+(right-left)/2];
        int lt=left,i=left,rt=right;
        while(i<=rt){
            if(nums[i]<pivot){
                int temp=nums[lt];
                nums[lt++]=nums[i];
                nums[i++]=temp;
            }
            else if(nums[i]>pivot){
                int temp=nums[rt];
                nums[rt--]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        quickSort(left,lt-1,nums);
        quickSort(rt+1,right,nums);
    }
    
    public int[] sortArray(int[] nums) {
        quickSort(0,nums.length-1,nums);
        return nums;
    }
}
