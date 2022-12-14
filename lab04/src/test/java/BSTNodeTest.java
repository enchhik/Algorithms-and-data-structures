import org.example.BSTNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BSTNodeTest {

        Map<Integer, String> bst;

        @BeforeEach
        void TestInit() {
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
            bst.put(25, "Filipchuk");
            bst.put(19, "Uzhhorod");
            bst.put(20, "Ternopil");
            bst.put(16, "Shevchenko");
            bst.put(21, "Sumy");
            bst.put(17, "Bila Tserkva");
            bst.put(24, "Feodosiia");
        }


        @Test
        void TestTraversal() {
            BSTNode bstNode = new BSTNode();

            for (Map.Entry<Integer, String> item: bst.entrySet()) {
                bstNode.put(item.getKey(), item.getValue());
            }

            //bst.treeTraversal();
            System.out.println();
            Assertions.assertEquals(20, bst.size());
        }



    }

