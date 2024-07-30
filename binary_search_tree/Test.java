public class Test {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(10);
        myBST.insert(5);
        myBST.insert(15);
        myBST.insert(2);
        myBST.insert(8);
        myBST.insert(22);
        myBST.displayPreOrder(null);breakLine();
        myBST.displayInOrder(null);breakLine();
        myBST.displayPosOrder(null);breakLine();
    }

    public static void breakLine() {
        System.out.println();
    }
}
