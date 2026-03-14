class Solution {
    public int maxTurbulenceSize(int[] arr) {
        
        int n = arr.length;
        int max = 1;
        int left = 0;
        
        for(int right = 1; right < n; right++){
            
            int c = Integer.compare(arr[right-1], arr[right]);
            
            if(c == 0){
                left = right;
            }
            else if(right == n-1 || 
                   c * Integer.compare(arr[right], arr[right+1]) != -1){
                
                max = Math.max(max, right - left + 1);
                left = right;
            }
        }
        
        return max;
    }
}