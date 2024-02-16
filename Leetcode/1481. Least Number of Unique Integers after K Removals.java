class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int x : arr){
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        int[] valArr = new int[hm.size()];
        int i = 0;

        for(int v : hm.values()){
            valArr[i++] = v;
        }

        Arrays.sort(valArr);

        int j = 0;

        for(j=0; j < valArr.length; j++){
            if(k < valArr[j]){
                break;
            }

            k -= valArr[j];
        }

        return valArr.length - j;
    }
}