class Solution {
    public int missingNumber(int[] nums) {

        int last = nums.length;

        int start = 0;
        while(start <= last){

            if(!isNumPresent(nums, start)){
                return start;
            }

            start++;
        }

        return start;
    }

    boolean isNumPresent(int[] arr, int num){

        for(int i =0; i< arr.length; i++){
            if(num == arr[i]){
                return true;
            }
        }

        return false;
    }
}