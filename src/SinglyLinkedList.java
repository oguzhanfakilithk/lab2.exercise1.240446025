public class SinglyLinkedList {
        private Node head;
        public SinglyLinkedList() {
            head = null;
        }
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;

                while (current.next != null) {
                    current = current.next;
                }

                current.next = newNode;
            }
        }
        public void display() {

            Node current = head;

            while (current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }

            System.out.println("NULL");
        }
        public Node findMiddle() {

            if (head == null) {
                return null;
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
        public Node getHead() {
            return head;
        }
    }
