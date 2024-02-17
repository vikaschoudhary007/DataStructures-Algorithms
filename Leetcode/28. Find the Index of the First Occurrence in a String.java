class Solution {
    public int strStr(String haystack, String needle) {

        // return haystack.indexOf(needle);

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for(int i = 0;i <= haystackLength - needleLength; i++){

            if(haystack.substring(i, i + needleLength).startsWith(needle)){
                return i;
            }
        }

        return -1;

    }
}