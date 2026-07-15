class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        TreeSet<Integer> set = new TreeSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=len-1;i>-1;i--){
            int num=nums[i];
            Integer x=set.higher(num);
            arr.add(num);
            if(x!=null){
                arr.remove(x);
                Collections.sort(arr);
                nums[i]=x;
                for(int j=i+1;j<len;j++){
                    nums[j]=arr.get(j-i-1);
                }
                return;
            }
            set.add(num);
        }
        Arrays.sort(nums);
    }
}