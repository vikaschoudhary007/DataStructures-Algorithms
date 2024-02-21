class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i = 0; i< heights.length - 1; i++){

            int heightDiff = heights[i+1] - heights[i];

            if(heightDiff > 0){

                pq.offer(heightDiff);

                if(pq.size() > ladders){
                    bricks = bricks - pq.poll();
                }

                if(bricks < 0){
                    return i;
                }
            }
        }

        return heights.length - 1;

        // return helper(heights, bricks, ladders, 0);
    }

    // public int helper(int[] heights, int bricksRem, int laddersRem, int currIndex){


    //     if(currIndex == heights.length - 1){
    //         return currIndex;
    //     }

    //     if(heights[currIndex+1] <= heights[currIndex]){
    //         return helper(heights, bricksRem, laddersRem, currIndex+1);
    //     }

    //     if(bricksRem == 0 && laddersRem == 0){
    //         return currIndex;
    //     }

    //     if(bricksRem < (heights[currIndex+1] - heights[currIndex]) && laddersRem == 0){
    //         return currIndex;
    //     }


    //     if(bricksRem >= 0 && laddersRem >= 0){
    //         return Math.max(
    //             helper(heights, bricksRem - (heights[currIndex+1] - heights[currIndex]),
    //             laddersRem, currIndex+1),
    //             helper(heights, bricksRem, laddersRem-1, currIndex+1)
    //         );
    //     }else{
    //         return currIndex;
    //     }
    // }
}