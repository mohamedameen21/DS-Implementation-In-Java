package DS;

public class CircularDoublyLinkedList {

    private static class Node {
        private Node prev;
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }

}
