/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/**
 * No need to store the found path in any individual lists
 * Take one hashmap that will take the node val and then update the frequency as we traverse the tree
 * Remember to backtrack -> will have to remove the frqunecy of last node and maybe the node from
 * HashMap if the frequency of node reduce to 0.
 * Did try the approch of storing all paths and then creating a HashMap of each -> lead to Memoey and Time limit exceed
 * */


class Solution {

    // list of multiple such paths
    int counter = 0;

    public int pseudoPalindromicPaths (TreeNode root) {

        // list to store a path from root to leaf
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        helper(root, frequencyMap);

        return counter;
    }

    // helper implements DFS

    public void helper(TreeNode node, HashMap<Integer, Integer> frequencyMap){

        if(node == null){
            return;
        }

        frequencyMap.put(node.val, frequencyMap.getOrDefault(node.val, 0) + 1);

        if(node.left == null && node.right == null){

            int oddCount = 0;

            for(int val : frequencyMap.values()){
                if(val % 2 != 0){
                    oddCount++;
                }
            }

            if(oddCount <= 1){
                counter++;
            }

        }

        helper(node.left, frequencyMap);
        helper(node.right, frequencyMap);


        // remove the last node from paths to explore the right sub-tree
        frequencyMap.put(node.val, frequencyMap.getOrDefault(node.val, 0) - 1);
        if(frequencyMap.get(node.val) == 0){
            frequencyMap.remove(node.val);
        }

    }
}