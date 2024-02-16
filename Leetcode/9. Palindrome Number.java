class Solution {
    public boolean isPalindrome(int x) {

        String number = Integer.toString(x);

        int start = 0;
        int end = number.length()-1;

        while(start < end){
            if(number.charAt(start) != number.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

}