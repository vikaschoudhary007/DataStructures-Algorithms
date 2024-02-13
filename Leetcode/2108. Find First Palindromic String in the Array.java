class Solution {
    public String firstPalindrome(String[] words) {

        for(String word : words){

            if(isPalindrome(word)){
                return word;
            }
        }

        return "";

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