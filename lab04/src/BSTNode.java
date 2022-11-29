public class BSTNode {
    private Node root;

    private class Node
    {
        private int key;            //key
        private String str;         //value
        private Node left, right;   //links to subtrees
        private int N;              //number of nodes in the subtree with this root

        public Node (int key, String str, int N)
        {
            this.key = key;
            this.str = str;
            this.N = N;
        }

        public int size()
        {
            return size(root);
        }
        private int size(Node x)
        {
            if (x == null)
                return 0;
            else
                return x.N;
        }

        public String get(int key)
        {
            return get(root, key);
        }

        private String get(Node x, int key)
        {   //Returns the value associated with the key in the subtree rooted at x;
            //returns null if there is no key in the subtree rooted at x.
            if (x == null)
                return null;
            if (key < x.key)
                return get(x.left, key);
            else if (key > x.key)
                return get(x.right, key);
            else
                return x.str;
        }

        public void put(int key, String str)
        {   //search for a key. If found, the value is changed; if not, the tree grows.
            root = put(root, key, str);
        }

        private Node put(Node x, int key, String str)
        {
            //If the key is present in the subtree rooted at x,
            //its value is changed to str.
            //Otherwise, a new node is added to the subtree with the key "key" and the value str.
            if (x == null)
                return new Node(key, str, 1);
            if (key < x.key)
                x.left = put(x.left, key, str);
            else if (key > x.key)
                x.right = put(x.right, key, str);
            else
                x.str = str;
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }

        public void delete(int key)
        {
            root = delete(root, key);
        }

        private Node delete(Node x, int key) {
            if (x == null)
                return null;
            if (key < x.key)
                x.left = delete(x.left, key);
            else if (key > x.key)
                x.right = delete(x.right, key);
            else
            {
                if (x.right == null)
                    return x.left;
                if (x.left == null)
                    return x.right;
                Node t = x;
                x = min(t.right);
                x.right = deleteMin(t.right);
                x.left = t.left;
            }
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }

        private Node min(Node x) {
            if (x.left == null) return x;
            return min(x.left);
        }
        public void deleteMin()
        {
            root = deleteMin(root);
        }
        private Node deleteMin(Node x)
        {
            if (x.left == null)
                return x.right;
            x.left = deleteMin(x.left);
            x.N = size(x.left) + size(x.right) + 1;
            return x;
        }

    }
}
