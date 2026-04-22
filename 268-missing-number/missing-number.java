class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
           int arrxor=0;
        for(int i=0;i<n;i++){
        arrxor^=nums[i];
        xor^=i;
        }
        xor^=n;
        int ans=xor^arrxor;
        return ans;
    }
}