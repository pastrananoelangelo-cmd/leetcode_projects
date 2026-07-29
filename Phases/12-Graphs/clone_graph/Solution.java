/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Node clone = new Node();
        HashMap<Node, Node> map = new HashMap<>();

        if (node != null) {
            clone = dfs(node, map);
        } else {
            return null;
        }

        return clone;
    }

    private Node dfs(Node node, HashMap<Node, Node> map) {
        Node currNode;

        if (!map.containsKey(node)) {
            currNode = new Node(node.val);
            map.put(node, currNode);
        } else {
            return map.get(node);
        }

        for (Node neighbor : node.neighbors) {
            Node clonedNeighbor = dfs(neighbor, map);
            currNode.neighbors.add(clonedNeighbor);
        }

        return currNode;
    }
}