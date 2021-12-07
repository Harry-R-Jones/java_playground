package Projects.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    public void getRootElementTest(){
        BinaryTree bT = new BinaryTree(12);
        assertEquals(12, bT.getRootElement());
    }

    @Test
    public void getNumberOfElementsTest() {
        BinaryTree bT = new BinaryTree(12);
        bT.addElement(2);
        assertEquals(2, bT.getNumberOfElements());
    }

    @Test
    public void addElementTest(){
        BinaryTree bT = new BinaryTree(12);
        assertEquals(false, bT.findElement(20));
        bT.addElement(20);
        assertEquals(true, bT.findElement(20));
    }

    @Test
    public void findElementTest(){
        BinaryTree bT = new BinaryTree(12);
        bT.addElement(5);
        bT.addElement(19);
        bT.addElement(4);

        assertEquals(true, bT.findElement(12));
        assertEquals(true, bT.findElement(5));
        assertEquals(true, bT.findElement(19));
        assertEquals(false, bT.findElement(44));
    }

    @Test
    public void getSortedTreeAscTest(){
        BinaryTree bT = new BinaryTree(3);
        bT.addElement(4);
        bT.addElement(5);

        int[] sortedTree = {3,4,5};

        assertArrayEquals(sortedTree, bT.getSortedTreeAsc());
    }

    @Test
    public void getSortedTreeDescTest(){
        BinaryTree bT = new BinaryTree(3);
        bT.addElement(4);
        bT.addElement(5);

        int[] sortedTree = {5,4,3};

        assertArrayEquals(sortedTree, bT.getSortedTreeDesc());
    }



}
