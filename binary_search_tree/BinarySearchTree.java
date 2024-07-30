public class BinarySearchTree {
    private Node root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    public boolean hasLeft(Node node) {
        if (leftChild(node) != null) {
            return true;
        }
        return false;
    }

    public boolean hasRight(Node node) {
        if (rightChild(node) != null) {
            return true;
        }
        return false;
    }

    public Node leftChild(Node node) {
        return node.getLeftChild();
    }

    public Node rightChild(Node node) {
        return node.getRightChild();
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (this.root == null) {
            this.root = node;
        } else {
            insertRercusive(this.root, node);            
        }
        this.size = this.size + 1;
    }

    public void insertRercusive(Node current, Node node) {
        if (node.getData() < current.getData()) {
            if (leftChild(current) == null) {
                current.setLeftChild(node);
            } else {
                insertRercusive(leftChild(current), node);
            }
        }
        if (node.getData() > current.getData()) {
            if (rightChild(current) == null) {
                current.setRightChild(node);
            } else {
                insertRercusive(rightChild(current), node);
            }
        }
    }

    public void displayPreOrder(Node node) {
        if (this.root == null) {
            System.out.println("IS EMPTY");
            return;
        }
        if (node == null) {
            node = this.root;
        }
        System.out.print(node.getData() + " ");
        if (hasLeft(node)) {
            displayPreOrder(leftChild(node));
        }
        if (hasRight(node)) {
            displayPreOrder(rightChild(node));
        }
    }

    public void displayInOrder(Node node) {
        if (this.root == null) {
            System.out.println("IS EMPTY");
            return;
        }
        if (node == null) {
            node = this.root;
        }
        if (hasLeft(node)) {
            displayInOrder(leftChild(node));
        }
        System.out.print(node.getData() + " ");
        if (hasRight(node)) {
            displayInOrder(rightChild(node));
        }
    }

    public void displayPosOrder(Node node) {
        if (this.root == null) {
            System.out.println("IS EMPTY");
            return;
        }
        if (node == null) {
            node = this.root;
        }
        if (hasLeft(node)) {
            displayPosOrder(leftChild(node));
        }
        if (hasRight(node)) {
            displayPosOrder(rightChild(node));
        }
        System.out.print(node.getData() + " ");
    }
}