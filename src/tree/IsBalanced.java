package tree;

public class IsBalanced {
	public boolean isBalanced(Node root){
		if(isBalancedUsingHeight(root)== Integer.MAX_VALUE){
			return false;
		}
		else
			return true;
	}
	public int isBalancedUsingHeight(Node root){

		if(root==null) return -1;

		int lh = isBalancedUsingHeight(root.left);
		if(lh== Integer.MAX_VALUE)	return Integer.MAX_VALUE;

		int rh = isBalancedUsingHeight(root.right);
		if(rh== Integer.MAX_VALUE) return Integer.MAX_VALUE;

		int diffHeight = Math.abs(rh-lh);

		if(diffHeight>1) return Integer.MAX_VALUE;
		else return 1+ Math.max(lh, rh);		
	}	
	
}
