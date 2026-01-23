class MirrorBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
        }
    }

    public static Node mirror(Node root) {
        if(root == null) {
            return root;
        }

        Node leftSubtree = mirror(root.left);
        Node rightSubtree = mirror(root.right);

        root.left = rightSubtree;
        root.right = leftSubtree;

        return root;
    }

    public static void preOrder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = mirror(root);
        preOrder(root);
    }
}