public class BSTNode {

    class Node {
        int key;                    //key
        String str;                 //other data (string)
        Node left, right;           //left and right node child

        public void displayNode()   //node output
        {
            System.out.println("{");
            System.out.println(key);
            System.out.println(". ");
            System.out.println(str);
            System.out.println("} ");
        }
    }

    class Tree
    {
        private Node root;    //first node of tree

        public Tree() {       //constructor
            root = null;
        }

        // -------------------------------------------------------------

        public Node find(int key)       //finding a node with a given key
        {
            Node current = root;        //start at the root node
            while (current.key != key)
            {
                if(key < current.key)
                    current = current.left;
                else
                    current = current.right;
                if(current == null)
                    return null;
            }
            return current;
        }

        // -------------------------------------------------------------

        public void insert(int key, String str)
        {
            Node newNode = new Node();      //creating a new node
            newNode.key = key;              //data inserting
            newNode.str = str;
            if (root == null)               //root node does not exist
                root = newNode;             //root node exists
            else {
                Node current = root;
                Node parent;
                while (true){
                    parent = current;
                    if()
                }
            }

        }
    }
}
