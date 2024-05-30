package BinarySearchTreePart1;

public class SearchInBST {

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
        }
    }
    public static Node insert(Node root , int val)
    {
        if(root == null)
            root = new Node(val);
        if(root.data>val)
            root.left = insert(root.left,val);
        if(root.data<val)
            root.right = insert(root.right,val);
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
    public static boolean search(Node root, int key)
    {
        if(root == null)
            return false;
        if(root.data<key)
            return search(root.right,key);
        if(root.data>key)
            return search(root.left,key);
        if(root.data == key)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int [] values = {8,5,10,3,6,11,1,4,14};
        Node root = null;
        for(int i=0;i<values.length;i++)
        {
          root = insert(root,values[i]);
        }
//        inOrder(root);
        System.out.println(search(root,4));
    }
}
