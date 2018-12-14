
import java.util.HashMap;
import java.util.Map;

public class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) {
        this.label = x;
    }
}

class Solution {

    public static void main(String[] args){
        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        node1.next = node2;
        node2.next = node3;
        node1.random = node3;
        node2.random = node1;
        RandomListNode node = node1;
        while(node != null){
            System.out.println(node.label);
            node = node.next;
        }

        Solution solution = new Solution();
        RandomListNode newNode = solution.copyRandomList(node1);
        node = newNode;
        while(node != null){
            System.out.println(node.label);
            node = node.next;
        }
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> nodeMap = new HashMap<>();
        RandomListNode node = head;

        while(node != null){
            nodeMap.put(node, new RandomListNode(0));
            node = node.next;
        }

        RandomListNode newHead = null;
        node = head;

        while(node != null){
            RandomListNode newNode = nodeMap.get(node);
            if(newHead == null){
                newHead = newNode;
            }
            newNode.label = node.label;
            newNode.next = nodeMap.get(node.next);
            newNode.random = nodeMap.get(node.random);
            node = node.next;
        }
        return newHead;
    }
}