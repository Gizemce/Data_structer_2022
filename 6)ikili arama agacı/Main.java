public class Main{
    public static void main(String[] args){
        BTree bt=new BTree();
        bt.root=bt.insert(bt.root,10);
        bt.root=bt.insert(bt.root,15);
        bt.root=bt.insert(bt.root,8);
        bt.root=bt.insert(bt.root,20);
        bt.root=bt.insert(bt.root,4);
        bt.root=bt.insert(bt.root,12);

        System.out.println("kökün datasi:"+ bt.root.data);
        System.out.println("kökün sağindaki datasi:"+ bt.root.right.data);
        System.out.println("kökün solundaki datasi:"+ bt.root.left.data);
        System.out.println("kökün solunun solundaki data:"+bt.root.left.left.data);
        System.out.println("kökün sağinin saği datasi:"+ bt.root.right.data);
        System.out.println("kökün sağinin solundaki datasi:"+ bt.root.right.left.data);
    }
}