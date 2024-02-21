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
class Solution {

    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();

    public boolean isSameTree(TreeNode p, TreeNode q) {

        helper(p, list1);
        helper(q, list2);
        return list1.equals(list2);

    }

    public void helper(TreeNode root, List<Integer> list){

        if(root == null){
            list.add(null);
            return;
        }

        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);


    }
}