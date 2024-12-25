/* 
 *  class Node {
 *    int data;
 *    Node left; 
 *    Node right;
 *    public Node() {
 *      data = 0;
 *    }
 *    public Node(int d)  {
 *      data = d;
 *    }
 *  }
 *
 *  The above class defines a tree node.
 */
class Result {
    static int leaf = 0;
    static int nonLeaf = 0;
    static void inOrder(Node root){
      if(root == null)    return;
      if(root.left == null && root.right == null){
        leaf++;
      }else{
              nonLeaf++;
      }
      inOrder(root.left);
      inOrder(root.right);
    }
    static int countLeafs(Node root) {
      if(root == null)    return 0;
      leaf = 0;
      inOrder(root);
      return leaf;
    }
    static int countNonLeafs(Node root) {
      if(root == null)    return 0;
      nonLeaf=0;
      inOrder(root);
      return nonLeaf;
    }
  }