public boolean check(int[] nums) {
        int max=nums[0],n=nums.length;
        boolean fall=false;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                if(fall){
                    return false;
                }
                fall=true;
                if(nums[i]>max)
                return false;
            }
            else if(fall && nums[i]>max){
                return false;
            }
        }
        return true;
    }