class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] count = new char[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String keyStr = String.valueOf(count);
            if(!map.containsKey(keyStr)){
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);

        }

        return new ArrayList<>(map.values());
    }
}