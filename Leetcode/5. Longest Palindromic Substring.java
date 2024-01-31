class Solution {
    public String longestPalindrome(String s) {

        String[] dp = new String[s.length()];

        dp[0] = String.valueOf(s.charAt(0));

        for(int i = 1; i< s.length(); i++){

            dp[i] = dp[i-1];

            for(int j = 0; j<= i; j++){
                if((isValidPalindrome(s.substring(j,i+1)) &&
                        s.substring(j,i+1).length() > dp[i].length())
                ){
                    dp[i] = s.substring(j, i+1);
                }
            }

        }

        return dp[s.length()-1];

    }


    public boolean isValidPalindrome(String st){

        if(st.length() == 1){
            return true;
        }

        int start = 0;
        int end = st.length()-1;

        while(start < end){
            if(st.charAt(start) != st.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}