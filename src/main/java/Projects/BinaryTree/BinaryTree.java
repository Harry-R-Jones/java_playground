package Projects.BinaryTree;

import java.util.ArrayList;

/**
 * Class to represent a BinaryTree of Nodes
 */
public class BinaryTree implements BinaryTreeI{
    private final Node rootNode;

    /**
     * Constructor for BinaryTree
     * @param element the value of the root node
     */
    public BinaryTree(final int element){
        rootNode = new Node (element);
    }

    /**
     * Method to find which node is the root of the tree
     * @return Node the root node
     */
    public int getRootElement() {
        return rootNode.getValue();
    }

    /**
     * Method to find the number of elements in the tree
     * @return the number of elements
     */
    public int getNumberOfElements() {
        return getNumberOfElements(rootNode);
    }

    /**
     * Method to find the number of elements in the tree
     * @param node the node to start at
     * @return int the number of elements
     */
    private int getNumberOfElements(Node node){
        //We know we have the currently considered node
        int count = 1;

        if(!node.isRightChildEmpty()){
            //If there is a right child count elements below it(including it)
            count += getNumberOfElements(node.getRightChild());
        }
        if(!node.isLeftChildEmpty()){
            //If there is a left child count elements below it(including it)
            count += getNumberOfElements(node.getLeftChild());
        }

        return count;
    }

    /**
     * Method to add a single element to the tree
     * @param element the element to add
     */
    public void addElement(final int element) {
        addNodeToTree(rootNode, element);
    }

    /**
     * Method to add multiple elements to the tree
     * @param elements the elements to add
     */
    public void addElements(int[] elements) {
        //Add each element from the array individually
        for (int element : elements) {
            addElement(element);
        }
    }

    /**
     * Method to find whether a value is present in the tree
     * @param value the value to search for
     * @return boolean whether we find it or not
     */
    public boolean findElement(final int value) {
        Node node = findNode(value);
        if (node != null) {
            return true;
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) {
        return 0;
    }

    @Override
    public int getRightChild(int element) {
        return 0;
    }

    /**
     * Method to sort the tree into ascending order
     * @return int[] the sorted ints
     */
    public int[] getSortedTreeAsc(){
        return getSortedTreeAsc(rootNode);

    }

    /**
     * Recursive method to sort the tree into ascending order
     * @param node the node to sort from
     * @return int[] an array of ints smallest to largest
     */
    private int[] getSortedTreeAsc(Node node) {
        //Put the value at this node into an array
        int[] orderedInts = new int[1];
        orderedInts[0] = node.getValue();
        int[] tempArrayHolder;

        //Concatenate this array onto the end of the left child's order to preserve order
        if(!node.isLeftChildEmpty()) {
            tempArrayHolder = ArrayMerge.mergeTwoArrays(getSortedTreeAsc(node.getLeftChild()), orderedInts);
        } else {
            tempArrayHolder = orderedInts;
        }


        //Concatenate the right child's order on the end of that to get a complete order
        if(!node.isRightChildEmpty()) {
            orderedInts = ArrayMerge.mergeTwoArrays(tempArrayHolder, getSortedTreeAsc(node.getRightChild()));
        }

        return orderedInts;
    }

//    /**
//     * method to combine the elements of two arrays into a single array
//     * @param arr1 The first array to be merged
//     * @param arr2 The second array to be merged
//     * @return The combined int array
//     */
//    public static int[] mergeTwoArrays(int[] arr1, int[] arr2){
//        //Find the total number of elements
//        int totalSize = arr1.length + arr2.length;
//        //Create an array of that size
//        int[] mergedArr = new int[totalSize];
//
//        //Add the first array's elements
//        for(int i = 0; i < arr1.length; i++){
//            mergedArr[i] = arr1[i];
//        }
//        //Add the second array's elements at an offset index
//        for(int j = 0; j < arr2.length; j++){
//            mergedArr[arr1.length + j] = arr2[j];
//        }
//
//        return mergedArr;
//    }

    /**
     * Method to sort the tree in descending order
     * @return int[] an array of ints largest to smallest
     */
    public int[] getSortedTreeDesc() {
        return ArrayMerge.reverseOrder(getSortedTreeAsc());
    }

//    /**
//     * method to revers the order of elements in an array
//     * @param oldOrder the order to be flipped
//     * @return an int array with elements in reverse order
//     */
//    public static int[] reverseOrder(int[] oldOrder){
//        //create an array of the same length
//        int[] newOrder = new int[oldOrder.length];
//
//        //initialise a counter to count from the last element backwards
//        int counter = newOrder.length-1;
//
//        for (int i = 0; i < oldOrder.length; i++) {
//            //using the counter, walk backwards through the array adding elements to the new one in reverse order
//            newOrder[i] = oldOrder[counter];
//            counter--;
//        }
//        return newOrder;
//    }

    /**
     * Method to find a Node in the tree based on its value
     * @param element the value to search for
     * @return Node the node where the value is found
     */
    private Node findNode(int element){
        //Consider the root node first
        Node node = rootNode;

        while (node != null) {

            //If this node has the same value we have found it
            if (element == node.getValue()) {
                return node;
            }

            if (element < node.getValue()) {
                //If this node is bigger than value look left
                node = node.getLeftChild();
            } else {
                //If this node is smaller than value look right
                node = node.getRightChild();
            }
        }
        return null;
    }

    /**
     * Method to add a Node to the BinaryTree
     * @param node the node to add
     * @param element the int value of the node
     */
    private void addNodeToTree(Node node, final int element){

        //If value is smaller
        if(element <= node.getValue()){
            //If left child is null
            if(node.isLeftChildEmpty()){
                //This node will become the left child
                node.setLeftChild(new Node(element));
            } else {
                //We will try to add this below the left child
                addNodeToTree(node.getLeftChild(), element);
            }
            // If value is bugger
        } else if (element > node.getValue()){
            //If right child is empty
            if (node.isRightChildEmpty()) {
                //This becomes right child
                node.setRightChild(new Node(element));
            } else {
                //Add this value below right child
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }
}
