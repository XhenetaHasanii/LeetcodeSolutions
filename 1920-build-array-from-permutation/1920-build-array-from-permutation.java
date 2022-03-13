class Solution {
    int [] nums={0,2,1,5,3,4};
    public int[] buildArray(int[] nums) {
        
    int ans[]=new int[nums.length];
        for(int i = 0; i <nums.length ; i++){
            ans[i]=nums[nums[i]];
    
        
}
        return ans;
        }
    }