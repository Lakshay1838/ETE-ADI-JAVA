class Result {
    static void dfs(int mat[][],int m,int n,int i,int j){
        int[] rows = {-1,0,1,0};
        int[] cols = {0,-1,0,1};
        
        for(int it=0;it<4;it++){
            int nr = i + rows[it];
            int nc = j + cols[it];
            if(nr >=0 && nc >=0 && nr < m && nc < n && mat[nr][nc] == 1){
                mat[nr][nc] = 0;
                dfs(mat,m,n,nr,nc);
            }
        }
    }
  static int countIslands(int mat[][], int m, int n){
    // Write your code here
      int count=0;
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              if(mat[i][j] == 1){
                  count++;
                  dfs(mat,m,n,i,j);
              }
          }
      }
      return count;
  }   
}