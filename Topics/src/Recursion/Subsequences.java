package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequences {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 1, 2};

        helper(0, new ArrayList<>(), arr);
    }


    public static void helper(int index, List<Integer> list, int[] arr){

        if(index == arr.length){
            System.out.println(Arrays.toString(list.toArray()));
            return;
        }

        list.add(arr[index]);
        helper(index+1, list, arr);
        list.remove(list.size() - 1);
        helper(index+1, list, arr);

    }
}
