public class Node {
    private int data;
    private Node parent;
    private Node leftChild;
    private Node rightChild;

    public Node(int data) {
        this.data = data;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    // GETS METHODS
    public int getData() {
        return this.data;
    }
    public Node getParent() {
        return this.parent;
    }
    public Node getLeftChild() {
        return this.leftChild;
    }
    public Node getRightChild() {
        return this.rightChild;
    }

    //SETS METHODS
    public void setData(int newData) {
        this.data = newData;
    }
    public void setParent(Node newParent) {
        this.parent = newParent;
    }
    public void setRightChild(Node newRightChild) {
        this.rightChild = newRightChild;
    }
    public void setLeftChild(Node newLeftChild) {
        this.leftChild = newLeftChild;
    }
}
