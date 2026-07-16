class Solution {
    public void rotate(int[][] arr) {
        int l= arr.length;
        for(int x=0;x<(l+1)/2;x++){
            int a=x,b=x,c=l-x-1,d=l-x-1;
            for(int j=x;j<c;j++){
                int temp=arr[d][a];
                arr[d][a]=arr[c][d];
                arr[c][d]=arr[b][c];
                arr[b][c]=arr[a][b];
                arr[a][b]=temp;
                b++;
                d--;
            }
        }
    }
}