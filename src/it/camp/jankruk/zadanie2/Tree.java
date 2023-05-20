package it.camp.jankruk.zadanie2;

public class Tree {
    private Node root;
    public static Tree tree =  new Tree();

    private Tree() {
    }

    private Node addNew(Node node, int value){
        if (node == null) {
            return new Node(value);
        }
        if (value < node.getValue()) {
            node.setLeft(addNew(node.getLeft(), value));;
        }else if (value > node.getValue()) {
            node.setRight(addNew(node.getRight(), value));;
        }
        return node;
    }
    public void add(int value){
        if (tree.contains(value) && root !=null){
            return;
        }else{
            root = addNew(root,value);
        }

    }
    private boolean containNode(Node node,int value){
        if (node == null){
            return false;
        }
        if (value == node.getValue()){
            return true;
        }
        if (value > node.getValue()){
            return containNode(node.getRight(),value);
        }else{
            return containNode(node.getLeft(),value);
        }
    }
    public boolean contains(int value){
        return containNode(root,value);
    }
    private int checkMin(Node node){
        if (node.getLeft() != null){
            return checkMin(node.getLeft());
        }else{
            return node.getValue();
        }
    }
    public int min(){
            return checkMin(root);
    }
    private int checkMax(Node node){
        if (node.getRight() != null){
            return checkMax(node.getRight());
        }else{
            return node.getValue();
        }
    }
    public String max(){
            return Integer.toString(checkMax(root));
    }

    public Node getRoot() {
            return root;
    }
}
