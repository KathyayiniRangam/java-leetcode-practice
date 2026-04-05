class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // Correct method name: traverseInorder
    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + "->");
        inorder(node.right);
    }

    public void traverseInorder() {
        inorder(root);
    }
}

public class Main3 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        // Construct a sample binary tree:
        //      1
        //     / \
        //    12  9
        //   / \
        //  5   6
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        System.out.println("In Order traversal:");
        // Corrected call: use the 'I' in 'Inorder' consistently
        tree.traverseInorder(); 
    }
}
