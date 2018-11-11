
public class binarySearchTree {
	Node root;
	binarySearchTree(){
		this.root = null;
	}
	int findMin(Node r) {
		if(r == null) {
			return -1;
		}
		else if(r.left == null) {
			return r.data;
		}
		else {
			return findMin(r.left);
		}
	}
	int findMax(Node r) {
		if(r == null) {
			return -1;
		}
		else if(r.right == null) {
			return r.data;
		}
		else {
			return findMax(r.right);
		}
	}
	Node insert(Node r,int d)
	 {
		 if(r==null)
		 {
			 Node n=new Node(d);
			 r=n;
			 return r;
					 
		 }
		 if(r.data<d) {
			 r.right=insert(r.right,d);
		 }
		 else if(r.data>d)
		 {
			 r.left=insert(r.left,d);
		 }

			 return r;

	 }
	Node del(Node r, int d) {
		if(r==null) {
			return r;
		}
		if(r.data>d) {
			r.left = del(r.left,d);
		}
		else if(r.data<d) {
			r.right = del(r.right,d);
		}
		else {
			if(r.right == null && r.left == null) {
				return null;
			}
			else if(r.right == null) {
				r.left = del(r.left,d);
			}
			else if(r.left == null) {
				r.right = del(r.right,d);
			}
			else {
				Node insucc = new Node(findMin(r.right));
				r.data = insucc.data;
				r.right = del(r.right,d);
			}
		}
		return r;
	}
	boolean search(Node r , )
	void inorder(Node r) {
		if(r == null) {
			return;
		}
		inorder(r.left);
		System.out.println(r.data);
		inorder(r.right);
	}
	void preOrder(Node r) {
		if(r == null) {
			return;
		}
		System.out.println(r.data);
		preOrder(r.left);
		preOrder(r.right);
	}
	void postOrder(Node r) {
		if(r == null) {
			return;
		}
		System.out.println(r.data);
		postOrder(r.left);
		postOrder(r.right);
	}
	
}
 
