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
static int pathCount = 0;
 static void print(Node root,List<Integer> list,int h){
   if(root == null){
     return;
   }
   list.add(root.data);
   if(root.left == null && root.right == null){
     for(int i:list){
       System.out.print(i + " ");
     }
     System.out.println(h);
     pathCount++;
   }
   print(root.left,list,h+1);
   print(root.right,list,h+1);
   list.remove(list.size() - 1);
 }
  static void printAllPaths(Node root) {
    // Write your code here
    if(root == null)    return;
    List<Integer> list = new ArrayList<>();
    print(root,list,0);
    System.out.println(pathCount);
  }