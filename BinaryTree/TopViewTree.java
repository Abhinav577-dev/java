import java.util.*;
class TopViewTree {

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

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        //level order traversal
        Queue<Info> q = new LinkedList<>(); 
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);

                }
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }

            
        }

        for(int i=min; i<=max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void kLevel(Node root, int level, int k) {
        if(root == null ) {
            return;
        }
        if(level == k) {
            System.out.print(root.data+" ");
            return;
        }
        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root == null) {
            return false;
        }
        path.add(root);
        if(root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();

        getPath(root, n1, p1);
        getPath(root, n2, p2);

        int i=0;
        for(i=0; i<p1.size() && i<p2.size(); i++) {
            if(p1.get(i) != p2.get(i)) {
                break;
            }
        }

        //last equal node -> i-1th 


        Node lca = p1.get(i-1);
        return lca;
    }

    public static Node lca2(Node root, int n1, int n2) {
        
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        //left  = val right = null

        if(rightlca == null) {
            return leftlca;
        }

        if(leftlca == null) {
            return rightlca;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //topView(root);
        // int k = 2;
        // kLevel(root, 1, k);
        System.out.println(lca2(root, 4, 5).data);
    }
}