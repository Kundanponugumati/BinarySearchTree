package BinarySearchTreePart1;

public class BuildBST {

    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right=null;
        }
    }

    public static Node buildTree( Node root, int value)
    {
        if(root == null)
        {
            root = new Node(value);
            return root;
        }
        if(value>root.data)
        {
            root.right = buildTree(root.right,value);
        }
        if(value<root.data)
        {
            root.left = buildTree(root.left,value);
        }
        return root;
    }
    public static void inOrder(Node root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int [] values = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0;i<values.length;i++)
        {
            root = buildTree(root,values[i]);
        }
        inOrder(root);

    }
}
