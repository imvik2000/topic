class Node
{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }

}

public class HeightOfBinary {
    Node root;
 public static int maxdepth(Node root)
 {
     if(root==null)
     {
         return 0;
     }
     int left=maxdepth(root.left);

     int right=maxdepth(root.right);
return 1+Math.max(left,right);
 }
 

   public static void main(String args[])
   {
    HeightOfBinary tree =new HeightOfBinary();
    tree.root=new Node(1);
    tree.root.left=new Node(2);
    tree.root.right=new Node(3);
    tree.root.left.left=new Node(4);
    tree.root.left.right=new Node(5);
    System.out.println("height of tree:" +maxdepth(tree.root));


   }


}
