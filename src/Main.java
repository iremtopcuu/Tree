
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
        bst.root=bst.insert(bst.root,25);

        System.out.println("kök: " + bst.root.data);
        System.out.println("kökün solu: " + bst.root.left.data);
        System.out.println("kökün sağı: " + bst.root.right.data);

        System.out.println("PREORDER");
        bst.preOrder(bst.root);
        System.out.println("\nINORDER        ");
        bst.inOrder(bst.root);
        System.out.println("\n POSTORDER       ");
        bst.postOrder(bst.root);
        System.out.println();

        System.out.println("ağacın yüksekliği: " + bst.height(bst.root));
        System.out.println("eleman sayısı: " + bst.size(bst.root));
        System.out.println("max eleman: " +bst.findMax(bst.root));
        System.out.println(" max depth: " +bst.findDepth(bst.root) );

        System.out.println( bst.search(bst.root,10)) ;

        System.out.println(bst.findMin(bst.root));
    }
}