import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x)
    {
        val =x;
    }
}

public class InorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private static void inorder(TreeNode node, List<Integer> result){
        if(node == null) return;
        inorder(node.right, result);
        result.add(node.val);
        inorder(node.left, result);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(6);
        root.right = new TreeNode(4);

        System.out.println(inorderTraversal(root));
    }
}
