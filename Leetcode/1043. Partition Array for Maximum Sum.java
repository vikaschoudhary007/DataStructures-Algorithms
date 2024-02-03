class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {

        int[] dp = new int[arr.length];

        if(arr.length == 1){
            return arr[0];
        }else if(arr.length == 2){
            return Math.max(arr[0], arr[1])*2;
        }

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1])*2;
        dp[2] = Math.max(Math.max(arr[0], arr[1]), arr[2])*3;

        for(int i = 3; i < arr.length; i++){

            dp[i] = Math.max(dp[i-1], arr[i])*i;
        }

        return dp[arr.length-1];

    }
}