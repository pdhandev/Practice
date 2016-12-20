package tree;

public class IsBST {
	boolean checkBST(Node node, int min, int max) {
		if(node==null) return true;

		if(node.data<=min || node.data>=max) return false;

		return checkBST(node.left, min ,node.data ) && checkBST(node.right,node.data ,max );
	}
	boolean checkBST(Node root) {
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
}
