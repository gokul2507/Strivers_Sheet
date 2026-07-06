class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(nums[min]>nums[j])
                    min=j;
            }
            if(min!=i){
                int temp=nums[min];
                nums[min]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;
    }
}