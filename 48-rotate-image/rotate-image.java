class Solution {
    static void reverseArray(int arr[][],int start,int end){
        int i=0;
        end-=1;
        while(i<end){
            int temp=arr[start][i];
            arr[start][i]=arr[start][end];
            arr[start][end]=temp;
    i++;
            end--;
        }
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;
          for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            reverseArray(matrix,i,n);
        }

        
    }
}