class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int c=(n/3)+1;
        // System.out.println(c);
        Map<Integer,Integer> m=new HashMap<>();
        List result=new ArrayList<Integer>();
        for(int x:nums){
            m.put(x,m.getOrDefault(x,0)+1);
            if(m.get(x)==c){
                result.add(x);
            }
        }
        return result;
    }
}