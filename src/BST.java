
public class BST {
    Node root;  //root ilk düğüm ,kaybetmememiz gerekir

    public BST() { //constructor
        root = null;
    }


    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else {
            root = new Node(data);
        }
        return root;
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + "  ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(Node root) {
        if (root != null) {
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


    int height(Node root) {
        if (root == null) {
            return -1;
        } else {
            int lefth = height(root.left);
            int righth = height(root.right);
            return Math.max(lefth, righth) + 1;
        }
    }

    int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return size(root.left) + 1 + size(root.right);
        }
    }

    int findMax(Node root) {
        int max;
        if (root == null) {
            return 0;
        } else {
            int leftmax = findMax(root.left);
            int rightmax = findMax(root.right);

            if (leftmax > rightmax) {
                max = leftmax;
            } else {
                max = rightmax;
            }
            if (root.data > max) {
                max = root.data;
            }

        }
        return max;
    }

    int findDepth(Node root) {
        if (root == null) {
            return -1;
        } else {
            int ldepth = findDepth(root.left);
            int rdepth = findDepth(root.right);
            if (ldepth > rdepth) {
                return ldepth + 1;
            } else {
                return rdepth + 1;
            }
        }
    }

    Node search(Node root, int data) {
        if(root == null ){
            return null;
        }
        if ( root.data == data) {
            return root;
        }
        if (data < root.data) {
            return search(root.left, data);
        }
        if (data > root.data) {
            return search(root.right, data);
        }
       return  root;

    }



    int findMin(Node root){

        while(root.left!=null){
            root=root.left;
        }return root.data;

    }

 Node delete(Node root,int data){
        if(root==null){
            return null;
        }if(root.data>data){
            root.left=delete(root.left,data);
            return root;
     }else if(root.data<data){
            root.right=delete(root.right,data);
            return root;
        }else{
            if(root.left==null &&  root.right==null){ //tek node var
                return  null;
            } else if (root.left==null) { //sadece sağ çocuk var
                return root.right;
            } else if (root.right==null) { //sadece sol çocuk var
                return root.left;
            }else{  //iki çocuklu
                int max=findMax(root.left);
                root.data=max;
                root.left=delete(root.left,max);
                return root;
            }
     }
     }


    }






