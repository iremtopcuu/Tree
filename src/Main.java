public class Main {
    public static void main(String[] args){
        BST bst =new BST();
        bst.root=bst.insert(bst.root,10);
        bst.root=bst.insert(bst.root,8);
        bst.root=bst.insert(bst.root,15);
        bst.root=bst.insert(bst.root,5);
        bst.root=bst.insert(bst.root,12);
        bst.root=bst.insert(bst.root,20);
        bst.root=bst.insert(bst.root,9);

        System.out.println("kök: " + bst.root.data);
        System.out.println("kökün solu: " + bst.root.left.data);
        System.out.println("kökün sağı: " + bst.root.right.data);

        bst.preOrder(bst.root);

    }
}