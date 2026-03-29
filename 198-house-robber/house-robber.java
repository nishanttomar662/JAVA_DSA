class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp=new int[n];
        if(n==1){
            return nums[0];}
        else if(n==2){
        return Math.max(nums[0],nums[1]);}
         dp[0]=nums[0];
          dp[1]=Math.max(nums[0],nums[1]);
            for(int i=2;i<n;i++){
                int a=nums[i]+dp[i-2];
                int max=Math.max(a,dp[i-1]);
                dp[i]=max;
            
        }
        return dp[n-1];
        
    }
}