package alg;

import binaryTree.BinaryTree;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void shouldCreateBinaryTreeWithThreeElements() {
        BinaryTree bt = createBinaryTree();
        assertFalse(bt.isEmpty());
    }

    @Test
    public void shouldContainSpecificNode() {
        BinaryTree bt = createBinaryTree();

        assertTrue(bt.containsNode(5));
    }

    @Test
    public void shouldNotAddExistingElement() {
        BinaryTree bt = createBinaryTree();

        int initialSize = bt.getSize();

        assertTrue(bt.containsNode(3));
        bt.add(3);
        assertEquals(initialSize, bt.getSize());
    }



    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }

}