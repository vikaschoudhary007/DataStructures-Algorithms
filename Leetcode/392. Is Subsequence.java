class Solution {
    public boolean isSubsequence(String s, String t) {

        int m = t.length();
        int n = s.length();

        if(n == 0){
            return true;
        }

        if(n != 0 && m == 0){
            return false;
        }

        int i=0, j=0;

        while(j < m && i < n){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }


        return i == n;
    }
}