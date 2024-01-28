class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        if(maxMove == 0){
            return 0;
        }

        long MOD = 1000000007;
        long[][][] dp = new long[m + 2][n + 2][maxMove + 1];

        for (int i = 0; i < m + 2; i++) {
            for (int k = 0; k < maxMove + 1; k++) {
                dp[i][0][k] = 1;
                dp[i][n + 1][k] = 1;
            }
        }

        for (int i = 0; i < n + 2; i++) {
            for (int k = 0; k < maxMove + 1; k++) {
                dp[0][i][k] = 1;
                dp[m + 1][i][k] = 1;
            }
        }

        for (int k = 1; k < maxMove + 1; k++) {
            for (int i = 1; i < m + 1; i++) {
                for (int j = 1; j < n + 1; j++) {

                    long temp = 0;

                    temp += dp[i + 1][j][k - 1] % MOD;
                    temp += dp[i][j + 1][k - 1] % MOD;
                    temp += dp[i - 1][j][k - 1] % MOD;
                    temp += dp[i][j - 1][k - 1] % MOD;

                    dp[i][j][k] = temp % MOD;

                }
            }

        }

        return (int) (dp[startRow + 1][startColumn + 1][maxMove] % MOD);

    }
}
