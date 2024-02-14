class Solution {
    public int countSubstrings(String s) {

        // dp[i] = number of palindrome substring till index i
        int[] dp = new int[s.length()];
        dp[0] = 1;

        for(int i=1; i<s.length(); i++){

            int temp = 0;

            for(int j=0; j<= i; j++){
                temp += (isPalindrome(s.substring(j, i+1)) ? 1 : 0);
            }

            dp[i] = dp[i-1] + temp;
        }

        return dp[s.length()-1];

    }


    public boolean isPalindrome(String word){

        int start = 0;
        int end = word.length()-1;

        for(int i=0; i< word.length(); i++){

            while(start < end){
                if(word.charAt(start) != word.charAt(end)){
                    return false;
                }

                start++;
                end--;
            }
        }
        return true;
    }
}