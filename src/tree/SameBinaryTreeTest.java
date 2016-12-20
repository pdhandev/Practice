package tree;

import java.util.Stack;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }	
 * }
 */

public class SameBinaryTreeTest {
	//Recursive

	 public boolean isSameTreeR(TreeNode p, TreeNode q) {
	     if(p==null && q==null) return true;
	     if(p!=null && q!=null){
	         return (p.val == q.val) && isSameTreeR(p.left, q.left) && isSameTreeR(p.right, q.right); 
	     }
	     else return false;
	 }

	//Iterative
	public boolean isSameTreeI(TreeNode p, TreeNode q) {
		if(p==null && q==null) return true;
		if(p == null && q != null || p != null && q == null) return false;

		// when both are non null nodes
		Stack<TreeNode> stackP = new Stack<>();
		Stack<TreeNode> stackQ = new Stack<>();
		stackP.add(p);
		stackQ.add(q);

		while(!stackP.isEmpty() && !stackQ.isEmpty()){
			TreeNode tempP = stackP.pop();
			TreeNode tempQ = stackQ.pop();

			if(tempP.val != tempQ.val) return false;

			//they are equal then check their left and right child
			if(tempP.left!=null && tempQ.left!=null){
				stackP.push(tempP.left);
				stackQ.push(tempQ.left);
			}
			else if(tempP.left==null && tempQ.left==null){

			}
			else{
				return false;
			}

			if(tempP.right!=null && tempQ.right!=null){
				stackP.push(tempP.right);
				stackQ.push(tempQ.right);
			}
			else if(tempP.right==null && tempQ.right==null){

			}
			else{
				return false;
			}
		}

		if(!stackP.isEmpty() || !stackQ.isEmpty()) return false;
		return true;

	}     
}