	public static int getHeight(Node root) {
	 //Write your code here      
	 return checkHeight(root) - 1;
	}
	public static int checkHeight(Node root) {
	 if (root == null) {
	  return 0;
	 }
	 int leftHeight = checkHeight(root.left);
	 int rightHeight = checkHeight(root.right);
	 return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
	}