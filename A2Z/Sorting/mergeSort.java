class Solution {
    void mergeSort(int left, int right, int[] nums){
        if(left>=right){
            return;
        }
        int mid=left + (right-left)/2;
        mergeSort(left,mid,nums);
        mergeSort(mid+1,right,nums);
        int k=mid+1,i=left;
        List<Integer> temp=new ArrayList<>();
        while(left<=mid && k<=right){
            if(nums[left]<=nums[k]){
                temp.add(nums[left++]);
            }
            else{
                temp.add(nums[k++]);
            }
        }
        while(left<=mid){
            temp.add(nums[left++]);
        }
        int l=temp.size();
        for(int j=0;j<l;j++)
            nums[i+j]=temp.get(j);
    }
    public int[] sortArray(int[] nums) {
        int n= nums.length;
        mergeSort(0,n-1,nums);
        return nums;
    }
}