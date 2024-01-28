class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> dp = new ArrayList<>();

        if(rowIndex == 0){
            List<Integer> newList = new ArrayList<>();
            newList.add(1);
            dp.add(newList);
            return dp.get(rowIndex);
        }

        dp.add(new ArrayList<>(Arrays.asList(1)));

        for(int i = 1; i <= rowIndex; i++){

            List<Integer> prevList = dp.get(i-1);
            List<Integer> currentList = new ArrayList<>();

            currentList.add(1);

            for(int j=1; j<= prevList.size() - 1; j++){
                currentList.add(prevList.get(j-1) + prevList.get(j));
            }

            currentList.add(1);

            dp.add(currentList);

        }

        return dp.get(rowIndex);
    }
}