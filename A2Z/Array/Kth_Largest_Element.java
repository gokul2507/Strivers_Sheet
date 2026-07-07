class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max = nums[0], min = nums[0];
        for(int x : nums){
            if(x > max){
                max = x;
            }
            if(x < min){
                min = x;
            }
        }
        int[] freq = new int[max - min + 1];
        for(int n : nums){
            freq[n - min]++;
        }
        for(int i = freq.length - 1; ;i--){
            k -= freq[i];
            if(k <= 0)
            return (i + min);
        }
    }
}