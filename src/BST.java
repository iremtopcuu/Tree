public class BST {
    Node root;

    public BST() {
        root = null;
    }

    Node newNode(int data) { // Bu metodun amacı verilen data değeriyle yeni bir düğüm (Node) oluşturmak ve bu düğümü ağacın kökü (root) yapmak.
        root = new Node(data);
        return root;
    }

    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else {
            root = newNode(data);
        }
        return  root;
    }
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + "  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data + "  ");
            inOrder(root.right);

        }
    }

    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "  ");
        }
    }
}

