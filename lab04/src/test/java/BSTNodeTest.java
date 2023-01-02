import org.example.BSTNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BSTNodeTest {

        Map<Integer, String> bst;

        @BeforeEach
        void Test1Init() {
            bst = new HashMap<>();

            bst.put(5, "Dnipro");
            bst.put(23, "Poltava");
            bst.put(6, "Kyiv");
            bst.put(22, "Solomiia");
            bst.put(12, "Mykolaiv");
            bst.put(14, "Vinnytsia");
            bst.put(8, "Odesa");
            bst.put(11, "Kryvyi Rih");
            bst.put(7, "Kharkiv");
            bst.put(9, "Zaporizhzhia");
            bst.put(18, "Fastiv");
            bst.put(15, "Chernihiv");
            bst.put(10, "Lviv");
            bst.put(13, "Luhansk");
            bst.put(19, "Uzhhorod");
            bst.put(20, "Ternopil");
            bst.put(16, "Shevchenko");
            bst.put(21, "Sumy");
            bst.put(17, "Bila Tserkva");
            bst.put(24, "Feodosiia");
        }


    @Test
    void Test2Traversal() {
        BSTNode bstNode = new BSTNode();

        for (Map.Entry<Integer, String> item: bst.entrySet()) {
            bstNode.put(item.getKey(), item.getValue());
        }

        System.out.println();
        Assertions.assertEquals(20, bst.size());
    }

    @Test
    void Test3() {
        BSTNode bstNode = new BSTNode();

        for (Map.Entry<Integer, String> item: bst.entrySet()) {
            bstNode.put(item.getKey(), item.getValue());
        }

        System.out.println();
        Assertions.assertEquals("Feodosiia",bstNode.get(24));
        Assertions.assertEquals("Bila Tserkva",bstNode.get(17));
        Assertions.assertNull(bstNode.get(30));
        Assertions.assertNull(bstNode.get(41));
    }


    @Test
    void Test4() {
        BSTNode bstNode = new BSTNode();

        for (Map.Entry<Integer, String> item: bst.entrySet()) {

            bstNode.put(item.getKey(), item.getValue());

            if(item.getKey()!=20)
            {
                bstNode.put(item.getKey(), item.getValue());
            }
        }

        bstNode.put(20,"Novik");

        System.out.println(bstNode.get(20));
        Assertions.assertEquals("Novik", bstNode.get(20));
        bstNode.put(20, "Mariupol");

        bstNode.treeTraversal();
        System.out.println();
        Assertions.assertEquals(20, bstNode.size());

        System.out.println();
        Assertions.assertEquals("Mariupol", bstNode.get(20));
    }

    @Test
    void Test5() {
        BSTNode bstNode = new BSTNode();

        for (Map.Entry<Integer, String> item: bst.entrySet()) {
            bstNode.put(item.getKey(), item.getValue());
        }

        System.out.println();
        bstNode.delete(16);

        Assertions.assertEquals(19, bstNode.size());
        Assertions.assertNull(bstNode.get(16));
    }
}

