package com.mycompany.datastructurestree;

import java.util.Scanner;
import java.util.*;

public class DataStructuresTree {

    static LinkedList<Integer> values = new LinkedList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.print("How many baons did you collect? ");
        int studentsNum = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < studentsNum; i++) {
            System.out.print("Collected baon? ");
            int collectedBaon = scanner.nextInt();
            tree.insert(collectedBaon);
        }

        System.out.println();

        System.out.println("Inorder Traversal (Descending order): ");
        storeToLinkedList(tree.root);

        for (int value : values) {
            System.out.println("Baon: " + value);
        }

        System.out.println("\nInorder Traversal: ");
        tree.inorder();

        System.out.println("\nPostorder Traversal:  ");
        tree.postorder();
        
        System.out.println("\nPreorder Traversal:  ");
        tree.preorder();

    }

    public static void storeToLinkedList(Node root) {
        if (root != null) {
            storeToLinkedList(root.right);
            values.add(root.value);
            storeToLinkedList(root.left);
        }
    }
}
