public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
           int key=nums[i];
           int j=i-1;
           while(j>-1 && nums[j]>key){
            nums[j+1]=nums[j--];
           }
           nums[j+1]=key;
        }
        return nums;
    }