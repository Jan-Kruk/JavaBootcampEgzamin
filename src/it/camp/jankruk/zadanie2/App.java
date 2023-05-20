package it.camp.jankruk.zadanie2;

public class App {
    public static void main(String[] args) {
        Tree tree = Tree.tree;
        tree.add(1);
        tree.add(0);
        tree.add(4);
        tree.add(3);
        tree.add(20);
        tree.add(20);
        tree.add(8);
        tree.add(5);
        tree.add(27);
        tree.add(25);
        tree.add(-20);
        System.out.println(tree.getRoot().getValue());
        System.out.println(tree.getRoot().getRight().getValue());
        System.out.println(tree.getRoot().getRight().getLeft().getValue());
        System.out.println(tree.getRoot().getRight().getRight().getRight().getLeft().getValue());
        System.out.println(tree.min());
        System.out.println(tree.contains(0));
        System.out.println(tree.contains(30));
        System.out.println(tree.max());
    }
}
