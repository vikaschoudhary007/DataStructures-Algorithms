class Solution {
    public int maxLength(List<String> arr) {

        List<String> list = new ArrayList<>();
        list.add("");

        int result = 0;

        for(String word : arr){
            for(int i=0; i<list.size(); i++){
                String newWord = list.get(i)+word;

                if(isValid(newWord)){
                    list.add(newWord);
                    result = Math.max(result, newWord.length());
                }
            }
        }

        return result;
    }

    public boolean isValid(String word){

        Set<Character> set = new HashSet<>();

        for(char c : word.toCharArray()){
            if(!set.add(c)){
                return false;
            }
        }

        return true;
    }
}