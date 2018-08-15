class Node {
  /*Created node with right left and a data*/
  Node right;
  Node left;
  int data;
  Node(int data) {
    this.data = data;
    this.right = right;
    this.left = left;
    }
}

class Tree {
  Node root;
  public Tree(Node root) {
    this.root = root;
  }

  void insertNode(Node node, int data) {
    if(node.data < data) {
      if(node.left != null)
        insertNode(node.left, data);
      else {
        Node newNode = new Node(data);
        node.left = newNode;
      }
    }
    else {
      if(node.right != null)
        insertNode(node.right, data);
      else {
        Node newNode = new Node(data);
        node.right = newNode;
      }
    }
  }
  void print(Node root) {
    if(root == null)
      return;
    print(root.left);
    System.out.println(root.data);
    print(root.right);
  }
}
/*Printing data in a descending manner*/
class BinaryTree{
  public static void main(String[] args) {
    Tree b = new Tree(new Node(50));
    b.insertNode(b.root,25);
    b.insertNode(b.root,75);
    b.print(b.root);
  }
}
