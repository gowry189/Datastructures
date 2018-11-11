public class Test {
	public static void main(String [] args) {
	binarySearchTree bst = new binarySearchTree();
	bst.root =bst.insert(bst.root,60);
	bst.insert(bst.root,50);
	bst.insert(bst.root,40);
	bst.insert(bst.root,70);
	bst.insert(bst.root,20);
	bst.inorder(bst.root);
	System.out.println("-----------");
	bst.preOrder(bst.root);
	System.out.println("-----------");
	bst.postOrder(bst.root);
	bst.del(bst.root, 20);
	System.out.println("-----------");
	bst.postOrder(bst.root);
	System.out.println(bst.search(bst.root,70));
	System.out.println(bst.height(bst.root));
	//System.out.println(ht(bst.root));
	bst.kthLargest(2);
	//bst.kthSmallest(1);
	}
	/*static int ht(Node r) {
		if(r == null) {
			return 0;
		}
		int right = 1+ht(r.right);
		int left = 1+ht(r.left);
		if(left>right) {
			return left;
		}
		else {
			return right;
		}
	}*/
	
}
 
