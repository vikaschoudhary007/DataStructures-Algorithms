class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        return helper(heights, bricks, ladders, 0);
    }

    public int helper(int[] heights, int bricksRem, int laddersRem, int currIndex){


        if(currIndex == heights.length - 1){
            return currIndex;
        }

        if(heights[currIndex+1] <= heights[currIndex]){
            return helper(heights, bricksRem, laddersRem, currIndex+1);
        }

        if(bricksRem == 0 && laddersRem == 0){
            return currIndex;
        }

        if(bricksRem < (heights[currIndex+1] - heights[currIndex]) && laddersRem == 0){
            return currIndex;
        }


        if(bricksRem >= 0 && laddersRem >= 0){
            return Math.max(
                    helper(heights, bricksRem - (heights[currIndex+1] - heights[currIndex]),
                            laddersRem, currIndex+1),
                    helper(heights, bricksRem, laddersRem-1, currIndex+1)
            );
        }else{
            return currIndex;
        }
    }
}