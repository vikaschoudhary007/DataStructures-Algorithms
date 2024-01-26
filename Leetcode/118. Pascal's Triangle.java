class Solution {
    public List<List<Integer>> generate(int numRows) {

        // define dp first
        List<List<Integer>> resultList = new ArrayList<>();

        if(numRows == 0){
            return new ArrayList<>();
        }

        if(numRows == 1){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            resultList.add(temp);
            return resultList;
        }

        resultList = generate(numRows - 1);
        List<Integer> prevList = resultList.get(numRows - 2);

        List<Integer> currentList = new ArrayList<>();
        currentList.add(1);

        for(int i = 1; i< numRows-1; i++){
            currentList.add(prevList.get(i-1) + prevList.get(i));
        }

        currentList.add(1);
        resultList.add(currentList);

        return resultList;
    }
}