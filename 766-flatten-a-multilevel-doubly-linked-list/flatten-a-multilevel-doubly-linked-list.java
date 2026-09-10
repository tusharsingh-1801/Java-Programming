/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;

        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;
                Node childHead = flatten(curr.child);

                curr.next = childHead;
                childHead.prev = curr;
                curr.child = null;

                
                while (curr.next != null) {
                    curr = curr.next;
                }

                
                curr.next = next;
                if (next != null) {
                    next.prev = curr;
                }
            }
            curr = curr.next;
        }

        return head;
    }
}