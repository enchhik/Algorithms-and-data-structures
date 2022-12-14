package org.example;

public class Main {
    public static void main(String[] args) {

        BSTNode bst = new BSTNode();

        bst.put(3, "3");
        bst.put(4, "4");
        bst.put(23, "23");
        bst.put(25, "25");
        bst.put(1, "1");
        bst.put(7, "7");

        bst.treeTraversal();

        System.out.println();

        System.out.println(bst.min());
        bst.deleteMin();

        System.out.println();

        bst.treeTraversal();
    }
}
