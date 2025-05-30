package com.mycompany.datastructurestree;

public class BinaryTree {

    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {

        if (root == null) { // if root is empty
            return new Node(value); // return a new instantiated node
        }
        if (value < root.value) { // if the value is greater than what whats in the root
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }
    
    public void postorder() {
        postorderRec(root);
    }
    
    public void preorder() {
        preorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.printf("Baon: %s\n", root.value);
            inorderRec(root.right);
        }
    }

    public void postorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            inorderRec(root.right);
            System.out.printf("Baon: %s\n", root.value);
        }
    }
    
    public void preorderRec(Node root) {
        if (root != null) {
            System.out.printf("Baon: %s\n", root.value);
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }
}
