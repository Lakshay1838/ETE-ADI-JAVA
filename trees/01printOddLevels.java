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
    static void printOddLevelWise(Node root) {
    // Write your code here
    if(root == null)    return;    
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    boolean isOdd = true;
    while(!q.isEmpty()){
      Node top = q.poll();
      if(top == null){
        if(isOdd == true)    isOdd = false;
        else isOdd = true;
        if(!q.isEmpty()){
          q.add(null);
        }
      }else{
        if(isOdd == true){
          System.out.print(top.data + " ");
        }
          if(top.left != null){
            q.add(top.left);
          }
          if(top.right != null){
            q.add(top.right);
          }
        }
    } 
  }
    static void printOdd(Node root) {
      // Write your code here
      printOddLevelWise(root);
    }
  }