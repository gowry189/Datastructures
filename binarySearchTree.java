
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
	boolean search(Node r , int element) {
		if(r == null) {
			return false;
		}
		if(r.data == element) {
			return true;
		}
		else {
			if(r.data>element) {
				return search(r.left,element);
			}
			else {
				return search(r.right,element);
			}
		}
		
	}
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
	int height(Node r) {
		if(r == null) {
			return 0;
		}
		int right = 1+height(r.right);
		int left = 1+height(r.left);
		if(left>right) {
			return left;
		}
		else {
			return right;
		}
}
	class count {
		int c = 0;
	}
	void kthLargestUtil(Node node,int k, count C) {
		 if (node == null || C.c >= k) 
	            return; 
	          

	        this.kthLargestUtil(node.right, k, C);  
	        C.c++; 
	          
	        if (C.c == k) { 
	            System.out.println(k + "th largest element is " +  
	                                                 node.data); 
	            return; 
	        } 
	          

	        this.kthLargestUtil(node.left, k, C);  
	}
	void kthLargest(int k) 
    { 
		count C = new count();
        this.kthLargestUtil(this.root, k, C); 
    } 
	/*void kthSmallestUtil(Node r,int k, count q) {
		if(k == q.c) {
			return; 
		}
		this.kthSmallestUtil(r.left,k,q);
		q.c++;
		if(q.c==k) {
			System.out.println(r.data);
		}
		this.kthSmallestUtil(r.right,k,q);
	}
	void kthSmallest(int k) {
		count q = new count();
		this.kthSmallestUtil(this.root,k,q);
	}*/
}
