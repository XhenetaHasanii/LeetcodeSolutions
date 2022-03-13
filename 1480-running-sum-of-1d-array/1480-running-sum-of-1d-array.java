class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans=new int[nums.length];
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum=nums[i]+sum;
            ans[i]=sum;
        }
        return ans;
    }


}
        
    