package Projects.BinaryTree;

import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BinaryTreeHamcrestTest {

    private BinaryTree binaryTree;
    int[] ascending;
    int[] descending;

    @BeforeEach
    void setup() {
        binaryTree = new BinaryTree(50);
        binaryTree.addElement(14);
        binaryTree.addElement(60);
        binaryTree.addElement(39);
        binaryTree.addElement(75);

        ascending = new int[] {14,39,50,60,75};
        descending = new int[] {75,60,50,39,14};
    }

    @Nested
    @DisplayName("Binary Tree Tests")
    class HamcrestBinaryTreeTests{

        @Test
        @DisplayName("Hamcrest: get root element test")
        public void getRootElementTest(){
            assertThat(binaryTree.getRootElement(), equalTo(50));
        }

        @Test
        @DisplayName("Hamcrest: get number of elements test")
        public void getNumberOfElementsTest() {
            assertThat(binaryTree.getNumberOfElements(), equalTo(5));
        }

//        @Test
//        @DisplayName("Hamcrest: add element test")
//        public void addElementTest(){
//        }

        @Test
        @DisplayName("Hamcrest: find element test")
        public void findElementTest(){
            assertThat(binaryTree.findElement(75),equalTo(true));
        }

        @Test
        @DisplayName("Hamcrest: get sorted tree (ascending) test")
        public void getSortedTreeAscTest(){
            assertThat(binaryTree.getSortedTreeAsc(), equalTo(ascending));
        }

        @Test
        @DisplayName("Hamcrest: get sorted tree (descending) test")
        public void getSortedTreeDescTest(){
            assertThat(binaryTree.getSortedTreeDesc(), equalTo(descending));
        }
    }


}
