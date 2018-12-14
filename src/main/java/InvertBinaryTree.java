

public class InvertBinaryTree {

    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        TreeNode leftNode = new TreeNode(2);
        TreeNode rightNode = new TreeNode(7);
        root.left = leftNode;
        root.right = rightNode;
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        leftNode.left = node1;
        leftNode.right = node2;
        node1 = new TreeNode(6);
        node2 = new TreeNode(9);
        rightNode.left = node1;
        rightNode.right = node2;
        InvertBinaryTree tree = new InvertBinaryTree();
        tree.traverseTree(root);
        root = tree.invertTree(root);
        tree.traverseTree(root);

    }

    public int uniquePaths(int m, int n){
        return 0;
    }

    public TreeNode invertTree(TreeNode root){
        if(root != null){
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            root.right = left;
            root.left = right;
        }
        return root;
    }

    public void traverseTree(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            if(root.left != null){
                traverseTree(root.left);
            }
            if(root.right != null){
                traverseTree(root.right);
            }
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x){
        val = x;
    }
}