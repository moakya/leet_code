public class GoodNodes {

    public int goodNodes(TreeNode root) {
        return goodNodesAUX(root, root.val);
    }

    public int goodNodesAUX(TreeNode node, int max) {
        if (node == null){
            return 0;
        }

        int count = 0;

        if (node.val >= max){
            count++;
        }

        max = Math.max(max,node.val);

        return count + goodNodesAUX(node.left, max) + goodNodesAUX(node.right, max);

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 6};
        //generate new tree using the array and then call the goodNodes function by passing in the root
        //int[] arr = {3,1,4,3, Integer.MIN_VALUE, -1,1,5};
//        TreeNode tree = new TreeNode();
//        tree = generateTree(arr, tree, 0);
//        System.out.println(goodNodes(tree));
    }
}
