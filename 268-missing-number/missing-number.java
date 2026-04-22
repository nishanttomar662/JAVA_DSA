class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int [] hasharray=new int[n+1];
        for(int i=0;i<=n;i++){
              hasharray[i]=0;
        }
        for(int i=0;i<n;i++){
            hasharray[nums[i]]++;
        }
        int res=0;
        for(int i=0;i<=n;i++){
            if(hasharray[i]==0){
            res=i;
            break;
            }
    
        }
        return res;
    }
}