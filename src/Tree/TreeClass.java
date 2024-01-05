package Tree;


public class TreeClass {
    private Node root;

    private static Integer depth;
    public TreeClass() {
        this.root = null;
        depth=0;
    }

    public Node getRoot() {
        return root;
    }
    public void insert(int data) {
        Node node=root;
        while(node!=null){
            if(node.value<data) {
                if (node.right == null)
                    node.right = new Node(data);
                else
                    node = node.right;
            }
            else if (node.value>data){
                if(node.left==null)
                  node.left=new Node(data);
                else
                    node=node.left;
            }
            else
                break;
        }
        if (root==null)
            root=new Node(data);
    }

    public Node[] print(Node printRoot){
        Node[] array=new Node[2];
        Node node=root;
            System.out.println(node.value);
            array[0]=node.left;
            array[1]=node.right;
            return array;
    }
    public static int calculateHeight(Node heightRoot) {
        if (heightRoot == null) {
            return -1; // Height of an empty tree is -1
        } else {
            int leftHeight = calculateHeight(heightRoot.left);
            int rightHeight = calculateHeight(heightRoot.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
