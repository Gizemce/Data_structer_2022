public class Main{
    public static void main(String[] args) {
        Tree bst=new Tree();

        bst.root=bst.insert(bst.root,10);
        bst.root=bst.insert(bst.root,8);
        bst.root=bst.insert(bst.root,15);
        bst.root=bst.insert(bst.root,5);
        bst.root=bst.insert(bst.root,12);
        bst.root=bst.insert(bst.root,20);
        bst.root=bst.insert(bst.root,9);
        

        System.out.print("preOrder = ");
        bst.preOrder(bst.root);

        System.out.println();

        System.out.print("inOrder = ");
        bst.inOrder(bst.root);

        System.out.println();

        System.out.print("postOrder = ");
        bst.postOrder(bst.root);

    }

}