public class LinkedList {

    //  리스트의 첫 번째 노드를 가리키는 참조
    Node head;

    //    노드를 리스트의 마지막에 추가하는 메서드
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    //    노드를 리스트의 처음에 추가하는 메서드
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //    특정 데이터를 가진 노드를 리스트에서 삭제하는 메서드
    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    //    리스트의 모든 노드를 출력하는 메서드
    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "->");
            current = current.next;
        }

        System.out.println("null");
    }
}
