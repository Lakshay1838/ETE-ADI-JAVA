// TLE IN THIS CODE NEED TO OPTIMISE :

class Result {

    //static int ans = 0;
    static int fxn(int cost[][], int m, int n, int i, int j, int dp[][]) {
        if (i == m - 1 && j == n - 1) {
            return cost[i][j];
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int right = Integer.MAX_VALUE, diagonal = Integer.MAX_VALUE, bottom = Integer.MAX_VALUE;
        //right
        if (j + 1 < n) {
            right = fxn(cost, m, n, i, j + 1, dp);
        }
        //diagonal
        if (i + 1 < m && j + 1 < n) {
            diagonal = fxn(cost, m, n, i + 1, j + 1, dp);
        }
        //bottom
        if (i + 1 < m) {
            bottom = fxn(cost, m, n, i + 1, j, dp);
        }
        dp[i][j] = cost[i][j] + Math.min(right, Math.min(diagonal, bottom));
        return dp[i][j];
    }

    static int minCostPath(int cost[][], int m, int n) {
        // Write your code here 
        //we explore all paths 
        //rcc backtracking se 
        //is safe or not 
        //last we fing min cost using global variable
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        int ans = fxn(cost, m, n, 0, 0, dp);
        return ans;
    }
}
