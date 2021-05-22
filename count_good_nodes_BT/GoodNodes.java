public class GoodNodes {

    public static int goodNodes(TreeNode root) {
        return 1;
    }

    public static TreeNode generateTree(int[] values, TreeNode root, int index){
        // Base case for recursion
        if (index < values.length) {
            TreeNode temp = new TreeNode(values[index]);
            root = temp;

            // insert left child
            root.left = generateTree(values, root.left,
                2 * index + 1);

            // insert right child
            root.right = generateTree(values, root.right,
                2 * index + 2);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        //int[] arr = {3,1,4,3, Integer.MIN_VALUE, -1,1,5};
        TreeNode tree = new TreeNode();
        tree = generateTree(arr, tree, 0);
//        System.out.println(goodNodes(tree));
    }
}
