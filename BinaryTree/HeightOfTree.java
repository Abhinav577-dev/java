class HeightOfTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root) {
        if(root == null) {
            return 0;
        }

        int lcount = count(root.left);
        int rcount = count(root.right);

        return lcount + rcount + 1;
    }

    public static int SumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }

        int lSum = SumOfNodes(root.left);
        int rSum = SumOfNodes(root.right);

        return lSum + rSum + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(SumOfNodes(root));
    }
}