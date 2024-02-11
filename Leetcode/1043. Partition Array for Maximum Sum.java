class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {

        int[] dp = new int[arr.length+1];

        for(int i=1; i<= arr.length; i++){

            int maxSum = 0;
            int currentSum = 0;

            for(int j = 1; j <= k && j <= i; j++){

                currentSum = Math.max(currentSum, arr[i-j]);
                maxSum = Math.max(maxSum, dp[i-j] + currentSum * j);
            }

            dp[i] = maxSum;
        }

        return dp[arr.length];

    }
}