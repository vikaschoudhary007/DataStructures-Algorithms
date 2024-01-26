class Solution {
    public int tribonacci(int n) {

        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }

        // use n+1 length dp to store n = 0 also
        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;


        for(int i = 0; i <= n-3; i++){
            dp[i+3] = dp[i] + dp[i+1] + dp[i+2];
        }


        return dp[n];
    }
}