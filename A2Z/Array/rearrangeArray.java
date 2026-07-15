class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length,p=0,n=1;
        int[] res= new int[len];
        for(int num:nums){
            if(num>=0){
                res[p]=num;
                p+=2;
            }
            else{
                res[n]=num;
                n+=2;
            }
        }
        return res;
    }
}